
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int userInput = scanner.nextInt();
        
        while(userInput <= 100){
            System.out.println(userInput);
            userInput++;
        }
        
    }
}
