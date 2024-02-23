
import java.util.ArrayList;
import java.util.List;

public class Box implements Packable {

    private double maximumCapacity;
    private List<Packable> packables;

    public Box(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.packables = new ArrayList<>();
    }

    public void add(Packable packable) {

        if (this.maximumCapacity >= packable.weight()) {
            this.packables.add(packable);
            this.maximumCapacity = this.maximumCapacity - packable.weight();
        }

    }

    @Override
    public double weight() {

        double weight = 0;

        for (Packable packable : packables) {
            weight += packable.weight();
        }

        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + packables.size() + " items, total weight " + weight() + " kg";
    }

}
