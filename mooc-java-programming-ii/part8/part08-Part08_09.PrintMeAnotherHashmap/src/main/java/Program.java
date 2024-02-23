
import java.util.HashMap;
import java.util.Map;

public class Program {
    
    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));
        
        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    //prints all the values in the hashmap given as a parameter using
    public static void printValues(HashMap<String, Book> hashmap) {
        
        for (Map.Entry<String, Book> entry : hashmap.entrySet()) {
            System.out.println(entry.getValue().toString());
            
        }
    }

    //prints only the Books in the given hashmap which name contains the given string
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        
        for (Map.Entry<String, Book> entry : hashmap.entrySet()) {
            
            if (entry.getValue().getName().contains(text)) {
                System.out.println(entry.getValue().toString());
            }
            
        }
    }
    
}
