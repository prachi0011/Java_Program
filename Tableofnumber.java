
import java.util.Scanner;
public class Tableofnumber {
    public static void main(String[] args) {
        //scanner object
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        //declaring num variable
        int num = scan.nextInt();
        //closing scanneer class
        scan.close();
        int table =1;
        //calculation for finding table
        System.out.println("Table of "+num+"is below:");
        for (int i=1;i<=10;i++) {
            table = num*i;
            System.out.println(num+" x "+i+" = "+table);
        }
    }
}