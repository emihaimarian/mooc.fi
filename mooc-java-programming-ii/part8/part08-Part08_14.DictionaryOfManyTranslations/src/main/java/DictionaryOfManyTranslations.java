
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DictionaryOfManyTranslations {

    private final Map<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {

        this.dictionary.putIfAbsent(word, new ArrayList<>());
        this.dictionary.get(word).add(translation);

    }

    public ArrayList<String> translate(String word) {

        ArrayList<String> words = this.dictionary.get(word);

        if (words != null) {
            return this.dictionary.get(word);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
