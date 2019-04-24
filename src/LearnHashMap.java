import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {

    public static void main(String[] args) {

        // List<String> list = new ArrayList<>();
        // ArrayList - manage an ordered set of data
        // HashMap - represent an unordered data collection.

        // declare collection of states
        Map<String, String> map = new HashMap<>(); // the concrete implementation of the Map
        // interface named HashMap
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);

        map.put("Alaska", "Juneau");
        System.out.println(map);

        String cap = map.get("Oregon");
        System.out.println("The capital of Oregon is " + cap);

        map.remove("California");
        System.out.println(map);

    }

}
