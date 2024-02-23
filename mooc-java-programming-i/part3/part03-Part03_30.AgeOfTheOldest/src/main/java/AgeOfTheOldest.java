
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageOfTheOldest = 0;

        while (true) {

            String inputString = scanner.nextLine();

            if (inputString.equals("")) {
                break;
            }

            String[] wordSplit = inputString.split(",");

            int age = Integer.valueOf(wordSplit[1]);
            
            if (age > ageOfTheOldest){
                ageOfTheOldest = age;
            }
        }

        System.out.println("Age of the oldest: " + ageOfTheOldest);   
    }
}
