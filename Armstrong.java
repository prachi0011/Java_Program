import java.util.Scanner;

//import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = scan.nextInt();
        int count = 0;
        int num1 = num;
        //count number of digits
        while(num != 0){
            int n = num%10;
            count += 1;
            num = num/10;
        }
        //System.out.println(num1);
        //System.out.print(count);
        
        //System.out.print(count);
        int arm = 0;;
        int sqr = 1;
        int sum = 0;
        int num3 = num1;
        //int new_arm=0;
        //calculating sum of digits raise to power count
        for (int i=0; i<count; i++) {
            arm = num1%10;
            num1 = num1/10;
            for (int j =0; j<count; j++) {
                
                sqr = sqr*arm; //calculate num power of digits
               // 
            }
            System.out.println("the powerth of arm : "+sqr);
            sum = sum + sqr;
           sqr = 1;
           
        }
        System.out.println("the sume o digits of number : "+sum);
       
        if (sum == num3){
            System.out.println("The number is Armstrong");
        }
        else{
            System.out.println("The number is not Armstrong");
        }
        scan.close();
    }
}