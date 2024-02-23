
import java.util.ArrayList;

public class Hold {

    private int weight;
    private ArrayList<Suitcase> suitcasesList;

    public Hold(int weight) {
        this.weight = weight;
        this.suitcasesList = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {

        if (this.totalWeight() + suitcase.totalWeight() <= this.weight) {
            this.suitcasesList.add(suitcase);
        }
    }

    public int totalWeight() {

        int totalWeight = 0;

        for (Suitcase suitcase : suitcasesList) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }

    public void printItems() {

        for (Suitcase suitcase : suitcasesList) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        return this.suitcasesList.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
