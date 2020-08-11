import java.util.Scanner;
public class PrimeInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This  program give you list of  prime numbers in range of  yours  choice");
        System.out.print("Enter positive number of first range : ");
        int a = scan.nextInt();
        System.out.print("Enter positive  second number of last range : ");
        int b = scan.nextInt();
        //taking flag 
        int flag = 0;
        for(int i = a; i <= b; i++) {
            if (i == 1) {
                flag = 0;
            }
            else if (i==2) {
                flag = 1;
               System.out.print(i + " ");
            }
            else {
                int j = 2;
                while(j < (i-1)) {
                    int check = i % j;
                    if (check != 0) {
                        flag = flag +1; //if number is divisible then increase value of flag by 1

                    }
                    else {
                        flag = flag - 1;//if not divisible decresing value of flag by 1
                    }
                       j++;
                }
                //if flag value equals to number - 2, then print it 
                if (flag == (i-2)) {
                    System.out.print(i + " ");
                }
                flag = 1;//setting flag to one after printing prime number
            }
        }/*
        for (int k = a; k <=b; k++) {
            if (flag == true) {
                System.out.print(k + " ");
                }
            }*/
        scan.close();
    }
}