
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondValue = Integer.valueOf(scanner.nextLine());
        
        int sum = firstValue + secondValue;
        int extraction = firstValue - secondValue;
        int multiplication = firstValue * secondValue;
        double division = (double)firstValue / secondValue;
        
        System.out.println(firstValue + " + " + secondValue + " = " + sum);
        System.out.println(firstValue + " - " + secondValue + " = " + extraction);
        System.out.println(firstValue + " * " + secondValue + " = " + multiplication);
        System.out.println(firstValue + " / " + secondValue + " = " + division);
    }
}
