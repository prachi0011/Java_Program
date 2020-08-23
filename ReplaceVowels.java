package prachi.stringpractice;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer s1 = new StringBuffer(s);
        sc.close();
        char[] ar = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                s1.deleteCharAt(i);
               s1.insert(i, '*');
            }
        }
        System.out.println(s);
        System.out.println(s1);
    }
}
