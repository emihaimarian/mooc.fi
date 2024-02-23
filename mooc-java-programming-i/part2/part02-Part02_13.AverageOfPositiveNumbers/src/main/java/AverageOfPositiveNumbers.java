
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int trackOfInputtedNumbers = 0;
        
        while(true){
            int userInput = scanner.nextInt();
            
            if (userInput == 0){
                break;
            }
            
            if (userInput < 0){
                System.out.println("Cannot calculate the average");
            }
            
            if (userInput > 0){
                sum = sum + userInput;
                trackOfInputtedNumbers++;
            }
        }
        
        if (trackOfInputtedNumbers == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(sum/(double) trackOfInputtedNumbers);
        }
        
    }
}
