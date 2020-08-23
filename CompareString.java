package prachi.stringpractice;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two Strings for comparision : ");
        String string1 = obj.nextLine();
        String string2 = obj.nextLine();

        if (string1.equals(string2))
            System.out.println("Both strings are equal.");
        else if(string1.compareToIgnoreCase(string2) == 0)
            System.out.println("Both strings are equal, ignoring Lower case or upper case character.");
        else
            System.out.println("Strings are not equals.");
        obj.close();
    }
}
