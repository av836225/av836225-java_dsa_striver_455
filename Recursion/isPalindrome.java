package Recursion;

public class isPalindrome {
    public static void main(String[] args) {

        System.out.print(checkPalindrome("MADAM", 0));
    }

    public static boolean checkPalindrome(String s, int i) {
        if (i >= s.length() / 2) return true; // Base case: Reached the middle
        
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false; // Mismatch found

        return checkPalindrome(s, i + 1); // Recursive call
    }


}
