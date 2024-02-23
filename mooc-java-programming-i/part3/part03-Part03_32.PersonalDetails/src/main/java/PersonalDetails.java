
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nameLength = 0;
        String name = "";
        
        int sumOfBirthDate = 0;
        int counter = 0;
        
        while (true) {

            String inputString = scanner.nextLine();

            if (inputString.equals("")) {
                System.out.println("Longest name: " + name);
                System.out.println("Average of the birth years: " + (double) sumOfBirthDate / counter);
                break;
            }
            
            String[] wordSplitArray = inputString.split(",");
            
            sumOfBirthDate = sumOfBirthDate + Integer.valueOf(wordSplitArray[1]);
            counter++;
            
            if (wordSplitArray[0].length() > nameLength){
                nameLength = wordSplitArray[0].length();
                name = wordSplitArray[0];
            }
        }

    }
}
