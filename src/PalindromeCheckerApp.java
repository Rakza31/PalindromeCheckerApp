public class UseCase9PalindromeCheckerApp{
    private static boolean check(String s, int start, int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return check(s, start+1, end-1);
    }
    public static void main(String[] args){
        String word="madam";
        boolean result=check(word, 0, word.length()-1);
        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome?: "+result);
    }
}
