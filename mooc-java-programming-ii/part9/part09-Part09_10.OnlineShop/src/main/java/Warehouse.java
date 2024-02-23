
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> inventoryPrice;
    private Map<String, Integer> inventoryQuantity;

    public Warehouse() {
        this.inventoryPrice = new HashMap<>();
        this.inventoryQuantity = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {

        this.inventoryPrice.put(product, price);
        this.inventoryQuantity.put(product, stock);
    }

    public int price(String product) {

        if (this.inventoryPrice.containsKey(product)) {
            return this.inventoryPrice.get(product);
        }
        return -99;
    }

    public int stock(String product) {

        if (this.inventoryQuantity.containsKey(product)) {
            return this.inventoryQuantity.get(product);
        }
        return 0;
    }

    public boolean take(String product) {

        if (this.inventoryQuantity.containsKey(product) && this.inventoryQuantity.get(product) > 0) {
            this.inventoryQuantity.put(product, this.inventoryQuantity.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {

        Set<String> set = new HashSet<>();

        for (Object object : this.inventoryQuantity.keySet()) {
            set.add((String) object);
        }

        return set;
    }
}
