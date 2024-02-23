
import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> itemsList;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.itemsList = new ArrayList<>();
    }

    public void addItem(Item item) {

        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.itemsList.add(item);
        }

    }

    public void printItems() {
        for (Item item : itemsList) {
            System.out.println(item);
        }
    }

    public int totalWeight() {

        int totalWeight = 0;

        for (Item item : itemsList) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem() {

        if (this.itemsList.isEmpty()){
            return null;
        }
        
        Item heaviest = this.itemsList.get(0);

        for (Item item : itemsList) {

            if (item.getWeight() > heaviest.getWeight()) {

                heaviest = item;
            }
        }

        return heaviest;
    }

    @Override
    public String toString() {

        String toString = "";

        if (this.itemsList.isEmpty()) {
            return toString =  "no items (" + this.totalWeight() + " kg)";
        }

        if (this.itemsList.size() == 1) {
            toString = this.itemsList.size() + " item" + "(" + this.totalWeight() + "kg" + ")";
        } else {
            toString = this.itemsList.size() + " items" + "(" + this.totalWeight() + "kg" + ")";
        }

        return toString;
    }

}
