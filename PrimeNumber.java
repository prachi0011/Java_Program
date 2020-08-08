import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        int p = num - 2;
        if (num == 1)//1 is not prime 
            System.out.println("not a prime number....");
        else if (num == 2)//2 is prime
            System.out.println("Entered number is Prime Number!!");
            //checking for other numbers
            else {
               int num1 = num;//store number to other variable so that original number dont change
        while(num != 2){
            if(num1 % (num-1) != 0){
                p = p - 1;
                
            }
            else{
                p = p +1;
               // System.out.println("not a prime number..");
            }
            num--;
        }
        
    
    if (p == 0){
        System.out.println("Entered number is Prime Number!");
    }
    else {
        System.out.println("Entered number is not Prime Number!");
    }
}
        scan.close();
    }
}