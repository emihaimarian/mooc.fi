
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String inputString = scanner.nextLine();

            if (inputString.equals("")) {
                break;
            }

            String[] wordArray = inputString.split(" ");
            int getLast = wordArray.length - 1;
            
            System.out.println(wordArray[getLast]);
        }
    }
}
