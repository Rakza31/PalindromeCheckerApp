public class UseCase7PalindromeCheckerApp{
    public static void main(String[] args){
        String word="refer";
        Deque<Character> deque=new ArrayDeque<>();
        for(char c:word.toCharArray()){
            deque.add(c);
        }
        boolean palindrome=true;
        while(deque.size()>1){
            if (deque.removeFirst()!=deque.removeLast()) {
                palindrome=false;
                break;
            }
        }
        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome?: "+palindrome);
    }
}
