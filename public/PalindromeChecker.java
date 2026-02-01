public class PalindromeChecker {

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to check if a number is palindrome
    public static boolean isPalindromeNumber(int num) {
        String numStr = String.valueOf(Math.abs(num));
        String reversed = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversed);
    }

    public static void main(String[] args) {
        // Test string palindromes
        System.out.println("String Palindrome Tests:");
        System.out.println("'racecar' is palindrome: " + isPalindrome("racecar"));
        System.out.println("'A man, a plan, a canal: Panama' is palindrome: " + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("'hello' is palindrome: " + isPalindrome("hello"));
        System.out.println("'12321' is palindrome: " + isPalindrome("12321"));
        
        // Test number palindromes
        System.out.println("\nNumber Palindrome Tests:");
        System.out.println("121 is palindrome: " + isPalindromeNumber(121));
        System.out.println("123 is palindrome: " + isPalindromeNumber(123));
        System.out.println("9009 is palindrome: " + isPalindromeNumber(9009));
    }
}
