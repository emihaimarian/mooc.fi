
import java.util.ArrayList;
import java.util.List;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private List<Item> itemsInMaxBox;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemsInMaxBox = new ArrayList<>();
    }

    private int totalWeight(Item item) {

        int total = 0;

        for (Item itemInBox : itemsInMaxBox) {

            total += itemInBox.getWeight();
        }

        return total;
    }

    @Override
    public void add(Item item) {
        if (totalWeight(item) + item.getWeight() <= this.capacity) {
            this.itemsInMaxBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.itemsInMaxBox.contains(item);
    }
}
