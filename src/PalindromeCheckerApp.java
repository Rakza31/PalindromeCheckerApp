class PalindromeService{
    public static boolean checkPalindrome(String input){
        int start=0;
        int end=input.length()-1;
        while(start<end){
            if (input.charAt(start)!=input.charAt(end)){
                return false;
            }
            end--;
            start++;
        }
        return true;
    }
}
public class UseCase11PalindromeCheckerApp{
    public static void main(String[] args){
        String word="racecar";
        boolean palindrome=PalindromeService.checkPalindrome(word);
        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome?: "+palindrome);
    }
}
