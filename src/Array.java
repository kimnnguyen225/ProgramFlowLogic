import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        System.out.println("Array of primitives");
        int[] integers = {9,7,8,3};
        Arrays.sort(integers);
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);

        }

        System.out.println("Array of strings");
        String[] colorStrings = {"Red", "Green", "Blue"};
        // for each loop to loop through the values,
        // each time through the loop, we'll be working with a string, and giving
        // it a name "color" and we'll get its values from the array named colorStrings
        Arrays.sort(colorStrings);
        for (String color : colorStrings) {
            System.out.println(color);
        }

        // with an array of primitive values declared in this way, then value will all
        // be the default for that data type, zero for the numeric primitives, false
        // for Booleans, etc.
        /*
        * arraycopy() method takes five arguments. The first argument is the original
        * array then there's an integer, which is the beginning position from where you
        *  want to copy. Then the third argument is the destination array and then a
        * beginning position where you want to copy to and a length, the number of
        * items you want to copy
        */
        System.out.println("Setting an initial size");
        int[] sized = new int[10];
        for (int i = 0; i < sized.length; i++) {
            sized[i] = i * 100;
        }
        for (int value : sized) {
            System.out.println(value);
        }

        System.out.println("Copying an array");
        int[] copied = new int[5];
        System.arraycopy(sized, 5, copied,0, 5); //copy from sized array,
        // starting at index 5 (half way through the array), set destination array to
        // copied, pass in values 0 and 5, copying to the range, starting at 0, going
        // through5.
        /*
        * You can re-use the variable 'value' because it's scope in the original
        * declaration was limited to its for loop so you can reuse the variable name
        */
        for (int value : copied) {
            System.out.println(value);
        }
    }

}
