import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number :  ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number :  ");
        int num2 = scan.nextInt();
        System.out.println("=====================================================");
        System.out.println("First number is : "+num1);
        System.out.println("Second number is  : "+num2);
        int a = num1;
        int b = num2;
        num1 = b;
        num2 = a;
        System.out.println("============================================================");
        System.out.println("first number after swap : "+num1);
        System.out.println("Second number after swapping : "+num2);
        scan.close();
    }
    
}