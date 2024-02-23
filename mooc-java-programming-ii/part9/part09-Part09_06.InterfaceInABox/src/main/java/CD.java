
public class CD implements Packable {

    private String artistName;
    private String albumName;
    private int publicationYear;
    private double weight;

    public CD(String artistName, String albumName, int publicationYear) {
        this.artistName = artistName;
        this.albumName = albumName;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artistName + ": " + this.albumName + " (" + this.publicationYear + ")";
    }
}
