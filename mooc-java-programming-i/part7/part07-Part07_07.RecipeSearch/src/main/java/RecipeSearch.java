
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RecipeRegister recipeRegister = new RecipeRegister();

        UserInterface userInterface = new UserInterface(scanner, recipeRegister);

        userInterface.start();
    }

}
