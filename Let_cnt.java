import java.util.Scanner;

public class Let_cnt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to my program! This program help you to count repetion of character in a string.");
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        System.out.println("Lets, begin " + name);
        System.out.println("#############################################################");
        String str1 = "The quick brown fox jumps over the lazy dog";
        System.out.println(str1);
        int count =0;
        System.out.print("Enter the character : ");
        char c = scan.nextLine().charAt(0);
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (c == ch){
                count += 1;
            }
        }
        System.out.print(c + " is " + count + " times in the given string.");
        scan.close();
    }
    
}