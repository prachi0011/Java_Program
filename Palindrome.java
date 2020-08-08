import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter a word or any string:");
        //String word = scan.nextLine();//input string
        System.out.println("Enter a number:");
        int num = scan.nextInt();//input number
        int reverse=0;
        int num1 = num;
        while(num1!= 0){
            
            int digit = num1 % 10;
            num1 = num1 / 10;
            reverse = reverse*10 + digit;
        }
        scan.close();
        System.out.println(num);
        System.out.println(reverse);
        if(num == reverse){
         System.out.println("THE ENTERED NUMBER IS A PALINDROME!");
        }
        else{
        System.out.println("number is not palindrome..");
        }
    }
}