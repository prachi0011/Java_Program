package prachi.stringpractice;

import java.util.Scanner;

public class CountVowelConsonantDigitSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Number of vowels in '" + s + "' : " + countVowel(s));
        System.out.println("Number of consonants in '" + s + "' : " + countConsonant(s));
        System.out.println("Number of digit in '" + s + "' : " + countDigit(s));
        System.out.println("Number of white spaces in '" + s + "' : " + countSpace(s));
        sc.close();
    }

    //count vowel
    static int countVowel(String s) {
        int vowel = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||s.charAt(i) == 'u'
            || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                vowel += 1;
            }
        }
        return vowel;
    }

    //count consonants
    static int countConsonant(String s) {
        int cons = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||s.charAt(i) == 'u'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'
            || Character.isDigit(s.charAt(i)) || s.charAt(i) == ' ')){
                cons += 1;
            }
        }
        return cons;
    }

    //count digits
    static int countDigit(String s) {
        int digit = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                digit += 1;
            }
        }
        return digit;
    }

    //count space
    static int countSpace(String s) {
        int space = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                space += 1;
            }
        }
        return space;
    }
    }
