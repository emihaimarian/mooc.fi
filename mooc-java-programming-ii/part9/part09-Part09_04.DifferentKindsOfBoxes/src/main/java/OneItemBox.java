
import java.util.ArrayList;
import java.util.List;

public class OneItemBox extends Box {

    private List<Item> oneItemBox;

    public OneItemBox() {
        this.oneItemBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {

        if (this.oneItemBox.isEmpty()) {
            this.oneItemBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.oneItemBox.contains(item);
    }

}
