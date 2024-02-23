
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj){
            return true;
        }
        
        if (!(obj instanceof Song)) {
            return false;
        }
        
        Song comparedSong = (Song) obj;
        
        if (this.name.equals(comparedSong.name) && this.artist.equals(comparedSong.artist) && this.durationInSeconds == comparedSong.durationInSeconds){
        
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
