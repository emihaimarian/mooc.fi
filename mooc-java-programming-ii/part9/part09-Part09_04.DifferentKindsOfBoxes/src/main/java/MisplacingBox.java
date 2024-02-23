
import java.util.ArrayList;
import java.util.List;

public class MisplacingBox extends Box {
    
    private List<Item> misplacedBoxes;
    
    public MisplacingBox() {
        this.misplacedBoxes = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        this.misplacedBoxes.add(item);
    }
    
    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
