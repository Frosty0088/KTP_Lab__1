import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(isPalindrome(word));
    }

    public static String reverseString(String str){
        String s1 = "";
        for(int i = str.length() - 1; i >= 0; i--){
            s1 += str.charAt(i);
        }
        return s1;
    }

    public static boolean isPalindrome(String word){
        return (reverseString(word).equals(word));
    }
}