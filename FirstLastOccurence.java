package prachi.stringpractice;

public class FirstLastOccurence{
    public static void main(String[] args) {
    String str = new String("Hello, World");
    char ch = 'o';
        System.out.println("The first occurence of " + ch + " in " + str + " is " + First(str, ch));
        System.out.println("The last occurence of " + ch + " in " + str + " is " + Last(str, ch));
    }

    public static int First(String s, char c) {
        int index1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                index1 = i;
                break;
            }
        }
        return index1;
    }

    //method for finding first occurence from last
    public static int Last(String s, char c) {
        int index2 = 0;
        for (int i = (s.length()-1); i >= 0; i--) {
            if (s.charAt(i) == c) {
                index2 = i;
                break;
            }
        }
        return index2;
    }
}
