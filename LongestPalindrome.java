public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        String longest = "";

        // Step 1: Generate all substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j+1);// babab - 5 > 3

                if (isPalindrome(sub)) {
                    // Step 3: Track the longest one
                    if (sub.length() > longest.length()) {
                        longest = sub;// longest  = 5;
                    }
                }
            }
        }

        return longest;
    }

    // Using only built-in methods
    private static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        String input = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(input));
    }
}
