
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 0; 
        
        while(true){
            
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 0){
                break;
            }
            
            if (userInput != 0){
                start = start + 1;
            }
        }
        
        System.out.println("Number of numbers: " + start);
    }
}
