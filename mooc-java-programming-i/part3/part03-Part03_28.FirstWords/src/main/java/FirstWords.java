
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            String inputString = scanner.nextLine();
            
            if(inputString.equals("")){
                break;
            }
            
            String[] wordArray = inputString.split(" ");
            
            System.out.println(wordArray[0]);
        }


    }
}
