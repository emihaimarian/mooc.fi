
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {
        Item item = new Item(product, 1, price);

        for (Item it : this.shoppingCart.values()) {
            if (it.equals(item)) {
                it.increaseQuantity();
                return;
            }
        }
        this.shoppingCart.put(product, item);
    }

    public int price() {
        int total = 0;
        for (Item item : this.shoppingCart.values()) {
            total += item.price();
        }
        return total;
    }

    public void print() {
        for (Item item : this.shoppingCart.values()) {
            System.out.println(item.getProduct() + ": " + item.getQty());
        }
    }
}
