package prachi.stringpractice;

import java.util.Scanner;

public class ImplementSwitchOnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        switch (str) {
            case "Java":
                System.out.println(str + " is used for oops.");
                break;
            case "Python":
                System.out.println(str + " is most famous languge.");
                break;
            case "C":
                System.out.println(str + " is basic language");
                break;
            case "Ruby":
                System.out.println(str + " on rails.");
        }
        sc.close();
    }
}
