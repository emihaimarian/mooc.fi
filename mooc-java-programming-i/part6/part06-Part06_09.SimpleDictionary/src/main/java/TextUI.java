
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {

        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {

            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                add();
            } else if (command.equals("search")) {
                search();
            } else {
                System.out.println("");
            }
        }
    }

    public void add() {

        System.out.println("Word:");
        String word = scanner.nextLine();

        System.out.println("Translation:");
        String translation = scanner.nextLine();

        dictionary.add(word, translation);
    }

    public void search() {

        System.out.println("To be translated:");
        String toBeTranslated = scanner.nextLine();

        System.out.println(dictionary.translate(toBeTranslated));
    }
}
