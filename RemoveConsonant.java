package prachi.stringpractice;

import java.util.Scanner;

public class RemoveConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer str = new StringBuffer(s);
        String s1 = new String();
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if (!(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||s.charAt(i) == 'u'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'
                    || Character.isDigit(s.charAt(i)) || s.charAt(i) == ' ')) {
               s1 = s1 + Character.toString(s.charAt(i));
            }
        }
        System.out.println(s1);
    }
}
