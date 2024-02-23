
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String stringInput = scanner.nextLine();

            if (stringInput.equals("")) {
                break;
            }

            String[] wordArray = stringInput.split(" ");

            for (String word : wordArray) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
