import java.util.Scanner;//import scanner class
public class Even_Odd{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //input number
        System.out.println("Enter the number you want to check for even or odd");
        int num = scan.nextInt();
        if(num%2==0)
            System.out.println(num+" is even  number.");
        else
            System.out.println(num+" is odd number.");
        scan.close();
    }
}