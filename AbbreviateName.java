package prachi.stringpractice;

import java.util.Scanner;

public class AbbreviateName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char f = name.charAt(0);
        String abb = Character.toString(f).toUpperCase()+".";
        int space = 0;
        for (int i = 1; i < (name.length()); i++) {
            if(name.charAt(i) == ' ') {
                space += 1;
                if (space < 2)
                    abb = abb + Character.toString(name.charAt(i + 1)).toUpperCase() + ".";
            }
            else if (space >= 2) {
                abb = abb + Character.toString(name.charAt(i));
            }

        }

        System.out.println(abb);

        sc.close();
    }
}
