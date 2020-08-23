package prachi.stringpractice;

import java.util.Scanner;

public class CapitalizeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        //creating object of class CapitalizeString
        CapitalizeString obj = new CapitalizeString();
        String ans = obj.CamelNotationString(str);
        System.out.println("Capitalized string : " + ans);
    }

    public String CamelNotationString(String str) {
        char[] c = str.toCharArray();
        //loop over char array for 1 greater than length
        for (int i = 0; i < c.length+1; i++) {
            if(i == 0)
                c[i] = Character.toUpperCase(c[i]);
            //checking condition for less than length
            else if (i < c.length){
                if (c[i] == ' ') {
                    //as character found to space, uppercase to next character
                    c[i+1] = Character.toUpperCase(c[i+1]);
                }
            }
        }
        //String.valueOf() converts array into string
        String result = String.valueOf(c);
        return result;
    }
}
