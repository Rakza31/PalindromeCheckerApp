public class UseCase10PalindromeCheckerApp{
    public static void main(String[] args){
        String word="A man a plan a canal Panama";
        String normalized=word.replaceAll("\\s+", "").toLowerCase();
        boolean palindrome=true;
        for(int i=0;i<=normalized.length()/2;i++){
            if(normalized.charAt(i)!=normalized.charAt(normalized.length()-1-i)){
                palindrome=false;
                break;
            }
        }
        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome?: "+palindrome);
    }
}
