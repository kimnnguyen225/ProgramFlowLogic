import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResizableArrayWithArrayList {

    public static void main(String[] args) {

        /*
        * the constructor method for the ArrayList class, not for the List interface. While it's
        * possible to create an instance of a interface, you would have to completely implement all
        * of its code. If you want to use a list object, that's built into the Java framework, use
        * ArrayList. An ArrayList contains an ordered collection of data. You could think of it as
        * a resizable array. When you declare the arraylist, you can declare it with a constructor
        * with no values, and then the ArrayList will grow as needed.
        */
        List<String> list = new ArrayList<>();

        list.add("California");
        list.add("Oregon");
        list.add("Washington");
        System.out.println(list);

        list.add("Alaska");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        // instead of using bracket notation, as you would with an array, call a method of the list
        // interface named Get, and pass in a value
        String state = list.get(1);
        System.out.println("The second state is " + state);

        int position = list.indexOf("Alaska");
        System.out.println("Alaska's position on arraylist: " + position);

    }

}
