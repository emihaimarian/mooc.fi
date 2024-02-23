
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int lastNumber = scanner.nextInt();
        
        int sum = 0;
        int number = 1;
        
        while (number <= lastNumber){
            sum += number;
            number++;
        }
        
        System.out.println("The sum is " + sum);

    }
}
