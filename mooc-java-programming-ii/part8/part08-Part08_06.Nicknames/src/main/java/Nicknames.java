
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
       
        Map<String, String> map = new HashMap<>();
        map.put("matthew", "matt");
        map.put("michael", "mix");
        map.put("arthur", "artie");
        
        System.out.println(map.get("matthew"));
        
    }

}
