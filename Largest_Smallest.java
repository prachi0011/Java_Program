import java.util.Scanner;
public class Largest_Smallest {
    public static void main(String[] args) {
        //declare scanner object
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n]; 
        System.out.println("Enter numbers:");
        for (int i=0;i<n;i++) {
            int num = scan.nextInt();
            arr[i] = num;
          // System.out.println("number = "+arr[i]);
        }
        //closing scanner class
        scan.close();
       // System.out.print(Arrays.toString(arr));
        int large =0;//assuming largest value to 0
        int small = 0;//assuming smallest value to 0
       for(int j=0;j<n;j++){
         //for largest
           if(large<arr[j]) {
            large = arr[j];
           }
           else {
             large = arr[0];
           }
           //for smallest
           if(small>arr[j]) {
            small = arr[j];
           }
           else {
             small = arr[0];
           }
          
      }
      System.out.println("The largest number is: "+large);
      System.out.println("The smallest number is: "+small);
    }
}