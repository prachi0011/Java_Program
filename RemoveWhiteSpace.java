package prachi.stringpractice;

import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = ob.nextLine();
        str = str.replaceAll("\\s","");
        System.out.println("After Removing space : " + str);
        ob.close();
    }
}
