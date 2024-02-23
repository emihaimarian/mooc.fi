
public class Archive {

    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        
       if (this == obj){
           return true;
       }
        
        if (!(obj instanceof Archive)){
            return false;
        }
        
        Archive comparedItem = (Archive) obj;
        
        if (this.identifier.equals(comparedItem.identifier)){
            return true;
        }else {
            return false;
        }
    }
}
