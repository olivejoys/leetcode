package PalindromeNumber;

public class Solution {
    public static boolean isPalindrome(int x) {
        String original = Integer.toString(x); //converting the number into a string

        String reverse = new StringBuffer(original).reverse().toString();
        System.out.println(reverse);

        return original.equals(reverse);

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
