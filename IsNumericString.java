package prachi.stringpractice;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class IsNumericString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = obj.nextLine();
        char[] str1 = str.toCharArray();

        boolean numeric = true;

        /*
        *-? allows zero or more (-) for negative numbers
        * \\d+ checks the string must have atleast 1 or more numbers(\\d)
        * (\\.\\d+)? allows zero or more of the given pattern (\\.\\d+)
        * in which
        *       (\\.) checks if the string contains decimal or not
        *       If yes, it should be followed by at least one or more number \\d+
         */
        numeric = str.matches("-?\\d+(\\.\\d)?");

        if(numeric)
            System.out.println(str + " is a number.");
        else
            System.out.println(str + " is not a number.");
        obj.close();
        ContainSubString s =new ContainSubString();
        boolean ss = s.substring1("helloholahdjkhw", "ll");
        System.out.println(ss);

    }
}
