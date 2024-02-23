
import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    //prints all the keys in the hashmap given as a parameter.
    public static void printKeys(HashMap<String, String> hashmap) {

        for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    //prints the keys in the hashmap given as a parameter, which contain the string given as a parameter.
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {

        for (Map.Entry<String, String> entry : hashmap.entrySet()) {

            if (entry.getKey().contains(text)) {
                System.out.println(entry.getKey());
            }
        }
    }

    //prints the values in the given hashmap whichs keys contain the given string.
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {

        for (Map.Entry<String, String> entry : hashmap.entrySet()) {

            if (entry.getKey().contains(text)) {
                System.out.println(entry.getValue());
            }
        }
    }
}
