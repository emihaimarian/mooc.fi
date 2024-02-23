
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private final ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);

    }

    public String history() {
        return this.changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {

        double result = 0;
        result = (double) super.getBalance() + amount;
        changeHistory.add(result);
        super.addToWarehouse(amount);

    }

    @Override
    public double takeFromWarehouse(double amount) {

        double result = 0;
        result = (double) super.getBalance() - amount;
        changeHistory.add(result);
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis() {

        System.out.println("Product: " + this.getName());

        System.out.println("History: " + changeHistory.toString());

        System.out.println("Largest amount of product: " + changeHistory.maxValue());

        System.out.println("Smallest amount of product:" + changeHistory.minValue());

        System.out.println("Average: " + changeHistory.average());
    }

}
