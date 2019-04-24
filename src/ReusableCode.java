import java.util.Scanner;

public class ReusableCode {

        static String[] months = {"January", "February", "March", "April", "May", "June",
                                    "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        loopIt("Months of the year");
        loopIt("Second run - test reusable method");
        loopIt("Third run - test method");
    }

//    static void loopIt() {
//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//        }
//    }
    static void loopIt(String title) {

        System.out.println(title);
        for (int i = 0; i < title.length(); i++) {
            System.out.print("*");
        }
        System.out.println("");

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }

}
