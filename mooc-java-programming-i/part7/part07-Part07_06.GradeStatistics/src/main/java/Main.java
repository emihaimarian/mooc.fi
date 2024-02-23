
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Register register = new Register();
        
        UserInterface userInterface = new UserInterface(scanner, register);
        
        userInterface.start();
    }
}
