
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int trackOfInputtedNumbers = 0;
        
        while(true){
        
            System.out.println("Give a number:");
            int userInput = scanner.nextInt();
            
            if(userInput == 0){
                break;
            }
            
            if (userInput != 0){
                sum = sum + userInput;
                trackOfInputtedNumbers++;
            }  
        }
        
        System.out.println("Average of the numbers: " + sum / (double) trackOfInputtedNumbers);
    }
}
