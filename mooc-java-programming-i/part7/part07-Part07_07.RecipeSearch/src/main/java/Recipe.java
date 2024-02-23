
import java.util.List;

public class Recipe {

    private String recipeName;
    private int cookingTime;
    private List<String> ingredients;

    public Recipe(String recipeName, int cockingTime, List<String> ingredients) {
        this.recipeName = recipeName;
        this.cookingTime = cockingTime;
        this.ingredients = ingredients;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getCockingTime() {
        return cookingTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void setCockingTime(int cockingTime) {
        this.cookingTime = cockingTime;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean hasRecipeName(String recipeName) {
        return this.recipeName.contains(recipeName);
    }

    public boolean hasIngredients(String ingredient) {
        return this.ingredients.contains(ingredient);
    }

    @Override
    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookingTime;
    }
}
