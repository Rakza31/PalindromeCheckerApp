public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String input = "madam";

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Two-pointer technique
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        System.out.println("Input text : " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
