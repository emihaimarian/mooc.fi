
public class Grade {

    private int grade;
    private Point point;

    public Grade(Point point) {
        this.point = point;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void convertPointsToGrades(Point point) {

        if (point.getPoint() < 50) {
            this.setGrade(0);
        } else if (point.getPoint() < 60) {
            this.setGrade(1);
        } else if (point.getPoint() < 70) {
            this.setGrade(2);
        } else if (point.getPoint() < 80) {
            this.setGrade(3);
        } else if (point.getPoint() < 90) {
            this.setGrade(4);
        } else {
            this.setGrade(5);
        }
    }
}
