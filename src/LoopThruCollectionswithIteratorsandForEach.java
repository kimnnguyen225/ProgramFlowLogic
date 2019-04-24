import java.util.*;

public class LoopThruCollectionswithIteratorsandForEach {

    public static void main(String[] args) {

        System.out.println("Ordered data");
        List<String> list = new ArrayList<>();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println("toString() output");
        System.out.println(list);
        System.out.println("");

        System.out.println("ArrayList iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
        System.out.println("");

        System.out.println("ArrayList ForEach statement");
        for (String value : list) {
            System.out.println(value);
        }
        System.out.println();

        System.out.println("Java 8 method reference, doesn't exist in Java 7 or older, Android " +
                "versions");
        list.forEach(System.out::println);
        System.out.println();

        System.out.println("Unordered data"); //unorderd formatting of the toString method of
        // List interface
        Map<String, String> map = new HashMap<String, String>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);
        System.out.println();

        System.out.println("HashMap Iterator"); //set is similar to a list, in that it contains
        // ordered data, it's not something ArrayList would do
        Set<String> keys = map.keySet(); //this method returns a set, now you have a unique set
        // of keys to reference the items in the map
        Iterator<String> iterator1 = keys.iterator();
        while (iterator1.hasNext()) {
            String key = iterator1.next();
            System.out.println("The capitol of " + key + " is " + map.get(key));
        }
        System.out.println();

        System.out.println("HashMap ForEach");
        for (String key : keys) {
            System.out.println("The capitol of " + key + " is " + map.get(key));
        }
        System.out.println();
    }

}
