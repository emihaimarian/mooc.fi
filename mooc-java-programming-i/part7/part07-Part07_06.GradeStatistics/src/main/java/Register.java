
import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<Point> points;
    private List<Point> passingPoints;
    private List<Grade> grades;

    public Register() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoints(Point point) {

        if (point.getPoint() >= 50) {
            this.passingPoints.add(point);
        }

        this.points.add(point);
        this.grades.add(convertPointToGrade(point));
    }

    private Grade convertPointToGrade(Point point) {

        Grade grade = new Grade(point);
        grade.convertPointsToGrades(point);

        return grade;
    }

    public double calculateAverageOfAllPoints() {

        int total = 0;

        if (this.points.isEmpty()) {
            return -1;
        }

        for (Point point : this.points) {
            total += point.getPoint();
        }

        return (double) total / this.points.size();
    }

    public double calculateAverageOfPassingPoints() {

        int total = 0;

        if (this.passingPoints.isEmpty()) {
            return 0.00;
        }

        for (Point point : this.passingPoints) {
            total += point.getPoint();
        }

        return (double) total / this.passingPoints.size();
    }

    public double passPercentage() {

        int participants = points.size();
        int passing = passingPoints.size();

        if (passing == 0) {
            return -1;
        } else {
            return 100 * (double) passing / participants;
        }
    }

    public int getTotalGrades(int inputGrade) {

        int total = 0;

        for (Grade grade : this.grades) {

            if (grade.getGrade() == inputGrade) {
                total++;
            }
        }
        return total;
    }
}
