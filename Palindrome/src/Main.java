import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n  Enter the word or phrase :  ");
        String str = scan.nextLine().toLowerCase();
        System.out.println("\n  It " + (isPalindrome(str) ? "is" : "is not") + " a Palindrome");

    }
    static boolean isPalindrome(String str) {
        if(!str.contains(" ")) {
            for(int i=0; i<str.length()/2; i++) {
                if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                    return false;
                }
            }
            return true;
        }
        else {
            String newStr = "";
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) != ' ' || str.charAt(i) != ',' || str.charAt(i) != '-') {
                    newStr += "" + str.charAt(i);
                }
            }
            for(int i=0; i<newStr.length()/2; i++) {
                if(newStr.charAt(i) != newStr.charAt(newStr.length()-i-1)) {
                    return false;
                }
            }
            return true;
        }
    }
}