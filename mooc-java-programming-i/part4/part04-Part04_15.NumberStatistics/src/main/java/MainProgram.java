
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        
        Statistics sum = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        System.out.println("Enter numbers:");

        while (true) {

            int numbers = scanner.nextInt();

            if (numbers == -1) {
                break;
            }
            
            sum.addNumber(numbers);
            
            if(numbers % 2 == 0){
                evenSum.addNumber(numbers);
            }else {
                oddSum.addNumber(numbers);
            }
        }

        System.out.println("Sum: " + sum.sum());
        System.out.println("Sum of even numbers: " + evenSum.sum());
        System.out.println("Sum of odd numbers: " + oddSum.sum());

    }
}
