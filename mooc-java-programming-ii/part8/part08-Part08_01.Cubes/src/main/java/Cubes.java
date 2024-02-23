
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
        
            String userInput = scanner.nextLine();
            
            if (userInput.contains("end")){
                break;
            }
            
            int transformToInteger = Integer.valueOf(userInput);
            
            System.out.println((int) Math.pow(transformToInteger, 3));
        }
    }
}
