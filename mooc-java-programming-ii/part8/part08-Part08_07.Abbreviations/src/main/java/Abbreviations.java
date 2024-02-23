
import java.util.HashMap;
import java.util.Map;

public class Abbreviations {

    private Map<String, String> abbreviations;

    public Abbreviations() {

        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(sanitizedString(abbreviation), sanitizedString(explanation));
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(sanitizedString(abbreviation));
    }

    public String findExplanationFor(String abbreviation) {

        if (hasAbbreviation(abbreviation)) {
            return this.abbreviations.get(abbreviation);
        } else {
            return null;
        }
    }

    private static String sanitizedString(String string) {

        if (string == null) {
            return "";
        }

        string = string.toLowerCase();

        return string.trim();
    }
}
