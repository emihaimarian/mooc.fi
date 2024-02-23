
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {

        String toString = "";

        if (this.elements.isEmpty()) {
            toString = "The collection " + this.name + " is empty.";
            return toString;
        }

        if (this.elements.size() == 1) {
            toString = "The collection " + this.name + " has " + this.elements.size() + " element:"
                    + "\n" + this.elements.get(0);
            return toString;
        } else {

            String items = "";
            toString = "The collection " + this.name + " has " + this.getElements().size() + " elements:\n";

            for (String e : elements) {
                items = items + e + "\n";
            }
            
            return toString + items;
        }
    }
}
