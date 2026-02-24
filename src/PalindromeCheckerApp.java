interface PalindromeStrategy{
    boolean check(String word);
}
class StackStrategy implements PalindromeStrategy{
    public boolean check(String word){
        java.util.Stack<Character> stack=new java.util.Stack<>();
        for(char c:word.toCharArray()){
            stack.push(c);
        }
        for(char c:word.toCharArray()){
            if(stack.pop()!=c){
                return false;
            }
        }
        return true;
    }
}
class DequeStrategy implements PalindromeStrategy{
    public boolean check(String word){
        java.util.Deque<Character> deque=new java.util.ArrayDeque<>();
        for(char c:word.toCharArray()){
            deque.add(c);
        }
        while(deque.size()>1){
            if (deque.removeFirst()!=deque.removeLast()){
                return false;
            }
        }
        return true;
    }
}
public class UseCase12PalindromeCheckerApp{
    public static void main(String[] args){
        StackStrategy stack=new StackStrategy();
        DequeStrategy deque=new DequeStrategy();
        String word="level";
        boolean stackPalindrome=stack.check(word);
        boolean dequePalindrome=deque.check(word);
        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome (Stack Strategy)?: "+stackPalindrome);
        System.out.println("Is it a palindrome (Deque Strategy)?: "+dequePalindrome);
    }
}
