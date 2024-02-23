
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Register register;

    public UserInterface(Scanner scanner, Register register) {
        this.scanner = scanner;
        this.register = register;
    }

    public void start() {
        readUserInput();
        printAverageOfAllTotalPoints();
        printAverageOfPassingTotalPoints();
        printPassPercentage();
        printGrades();
    }

    private void readUserInput() {

        System.out.println("Enter point totals, -1 stops:");

        while (true) {

            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == -1) {
                break;
            }

            if (userInput < 0 || userInput > 100) {
                continue;
            }

            this.register.addPoints(new Point(userInput));
        }
    }

    private void printAverageOfAllTotalPoints() {
        System.out.println("Point average (all): " + this.register.calculateAverageOfAllPoints());
    }

    private void printAverageOfPassingTotalPoints() {

        if (this.register.calculateAverageOfPassingPoints() == 0.00) {
            System.out.println("Point average (passing): " + "-");
        } else {
            System.out.println("Point average (passing): " + this.register.calculateAverageOfPassingPoints());
        }
    }

    private void printPassPercentage() {
        System.out.println("Pass percentage: " + this.register.passPercentage());
    }

    private void printGrades() {

        System.out.println("Grade distribution:");

        int grade = 5;

        while (grade >= 0) {
            int stars = this.register.getTotalGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println();

            grade--;
        }
    }

    private static void printStars(int stars) {

        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
