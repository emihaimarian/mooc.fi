
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int givenNumber = scanner.nextInt();
        
        int factorial = 1;
        int number = 1;
        
        while (number <= givenNumber){
        
            factorial = factorial * number;
            number++;
        }
        
        System.out.println("Factorial: " + factorial);
    }
}
