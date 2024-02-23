
import java.util.ArrayList;
import java.util.List;

public class RecipeRegister {

    List<Recipe> recipeRegister;

    public RecipeRegister() {
        this.recipeRegister = new ArrayList<>();
    }

    public List<Recipe> getRecipeRegister() {
        return recipeRegister;
    }

    public void setRecipeRegister(List<Recipe> recipeRegister) {
        this.recipeRegister = recipeRegister;
    }

    public void addRecipe(Recipe recipe) {
        this.recipeRegister.add(recipe);
    }

    public void searchAfterRecipeName(String recipeName) {

        for (Recipe recipe : this.recipeRegister) {

            if (recipe.hasRecipeName(recipeName)) {
                System.out.println(recipe);
            }
        }
    }

    public void searchAfterCookingTime(int cookingTime) {

        for (Recipe recipe : this.recipeRegister) {
            if (recipe.getCockingTime() <= cookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public void searchAfterIngredient(String ingredient) {

        for (Recipe recipe : this.recipeRegister) {

            if (recipe.hasIngredients(ingredient)) {
                System.out.println(recipe);
            }
        }
    }

    public void printAllRecipe() {

        for (Recipe recipe : this.recipeRegister) {
            System.out.println(recipe);
        }
    }
}
