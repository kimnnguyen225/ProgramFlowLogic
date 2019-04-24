import java.util.Scanner;

public class SwitchStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // in Java 6 and earlier, you can only use switch statement with primitive
        // in Java 7 and later, you can also use switch statement with string
        switch (input) {

            case "Jan":
                System.out.println("The month is 1");
                break;
            case "Feb":
                System.out.println("The month is 2");
                break;
            case "Mar":
                System.out.println("The month is 3");
                break;
            default:
                System.out.println("Choose another month");
        }

    }

}
