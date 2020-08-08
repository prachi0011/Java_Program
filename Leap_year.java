import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = scan.nextInt();
        

        //check for leap year
       /* if (year%4 ==0) {
            System.out.println("leap year");
        }*/
         if(year%100==0) {
             

            if (year%400==0){
                System.out.println("leap year===");
               //2000
            }
            else{
                System.out.print("not leap");//1700,1800
            }
        }
        else  if (year%4==0){
            System.out.println("leap year");//1996,2020
        }
        else {
            System.out.println("Not a Leap Year....");
        }
        scan.close();
    }
    
}