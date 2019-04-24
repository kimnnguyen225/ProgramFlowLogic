import java.util.Arrays;

public class TwoDimentionalArrays {

    public static void main(String[] args) {

        // outer array as 3 items and each item within that array will have 2 sub items
        String[][] states = new String[3][2]; // 2-dimentional arrays
        // For the first pair, set the index of the outer item and for the second pair
        // of brackets, set the index for the inner item. So this is the first sub item
        // in the first outer item of the array.
        states[0][0] = "California"; // item in outer array is state
        states[0][1] = "Sacramento"; // item in inner array is name of state or its capital
        states[1][0] = "Oregon";
        states[1][1] = "Salem";
        states[2][0] = "Washington";
        states[2][1] = "Olympia";

        for (int i = 0; i < states.length; i++) { // length property refers to outer array, i < 3
            StringBuilder sb = new StringBuilder();
            sb.append("The capital of ")
                    .append(states[i][0])
                    .append(" is ")
                    .append(states[i][1]);
            System.out.println(sb);
        }

    }

}
