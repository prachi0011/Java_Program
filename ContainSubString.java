package prachi.stringpractice;

import java.util.Scanner;

public class ContainSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Hello world! welcome you in my program.....yuyyyyy!";
        String str2 = "This is programming world!";
        String str3 = "Welcome to my programming hub......";
        System.out.println("Enter a string to check if the string is present in any of my given string or not.");
        String substr = sc.nextLine();
        //check using first method
        ContainSubString s = new ContainSubString();
        boolean result = s.substring1(str1, substr);

        //check using second method
        ContainSubString s2 = new ContainSubString();
        boolean result2 = s2.substring2(str2, substr);

        //check using third method
        ContainSubString s3 = new ContainSubString();
        boolean result3 = s3.substring3(str3, substr);

        System.out.println();
        if (result || result2 || result3) {
            if (result)
                System.out.println("The substring you entered is in my string : " + result);
            if (result2)
                System.out.println("The substring entered is in second string : " + result2);
            if (result3)
                System.out.println("The substring you entered is in third string : " + result3);
        }
        else
            System.out.println("The substring entered is not in any of my strings.");

    }

    boolean substring1(String str, String substr) {
        boolean output = false;
        int sublen = substr.length();
        for (int i = 0; i < (str.length()-sublen); i++) {
            String sub = str.substring(i, i+sublen);
            if (substr.equals(sub)) {
                output = true;
                break;
            }
        }
        return output;
    }

    //second method
    boolean substring2(String str, String substr) {
        return str.contains(substr);
    }

    //third method
    boolean substring3(String str, String substr) {
        int r = str.indexOf(substr);
        if (r == -1)
            return false;
        else
            return true;

    }
}
