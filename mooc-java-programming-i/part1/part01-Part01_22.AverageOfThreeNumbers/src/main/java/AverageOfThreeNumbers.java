
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int thirdValue = Integer.valueOf(scanner.nextLine());
        
        double average = ((double)firstValue + (double)secondValue + (double)thirdValue)/3;
        
        System.out.println("The average is " + average);
    }
}
