
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private RecipeRegister recipeRegister;

    public UserInterface(Scanner scanner, RecipeRegister recipeRegister) {
        this.scanner = scanner;
        this.recipeRegister = recipeRegister;
    }

    public void start() {

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        readFile(fileName);
    }

    private void readFile(String fileName) {

        try (Scanner readFile = new Scanner(Paths.get(fileName))) {

            printCommands();
            String command = scanner.nextLine();

            while (readFile.hasNextLine()) {

                String recipeName = readFile.nextLine();
                int cookingTime = Integer.valueOf(readFile.nextLine());
                String ingredient = readFile.nextLine();

                List<String> ingredientsFromFile = new ArrayList<>();

                while (readFile.hasNextLine()) {

                    if (ingredient.isEmpty()) {
                        break;
                    }

                    ingredientsFromFile.add(ingredient);
                    ingredient = readFile.nextLine();
                }
                this.recipeRegister.addRecipe(new Recipe(recipeName, cookingTime, ingredientsFromFile));
            }

            executeCommand(command);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private static void printCommands() {

        System.out.println("Commands: ");
        System.out.println("list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");
        System.out.print("Enter command: ");
    }

    private void executeCommand(String command) {

        switch (command) {

            case "list":
                this.recipeRegister.printAllRecipe();
                break;
            case "stop":
                break;
            case "find name":
                System.out.print("Searched word: ");
                String searchAfterRecipeName = scanner.nextLine();
                this.recipeRegister.searchAfterRecipeName(searchAfterRecipeName);
                break;
            case "find cooking time":
                System.out.print("Max cooking time: ");
                int searchAfterCookingTime = Integer.valueOf(scanner.nextLine());
                this.recipeRegister.searchAfterCookingTime(searchAfterCookingTime);
            case "find ingredient":
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                this.recipeRegister.searchAfterIngredient(ingredient);
                break;
            default:
                break;
        }
    }
}
