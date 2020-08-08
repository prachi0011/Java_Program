import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       //input number of which wanna print fib
       System.out.println("Enter a number: ");
       int num = scan.nextInt();
       int a = 0;
       int b = 1;
        //loop
        int i=0;
        int fib;
        System.out.println("FIBONACCI SERIES OF "+num+" : ");
        System.out.println("##############################################");
        while(i != num){
            if (i == 0){
                fib = a;
                System.out.print(fib);
               // System.out.print(" ");
            }
            else if(i == 1){
                fib = b;
                System.out.print(" ");
                System.out.print(fib);
                
            }
            else{
                fib = a+ b;
                a = b;
                b = fib;
                System.out.print(" ");
                System.out.print(fib);
                
            }
            i++;
        }
        System.out.println();
        System.out.println("##############################################");
        System.out.print("Thank You!");
       scan.close();
    }
}