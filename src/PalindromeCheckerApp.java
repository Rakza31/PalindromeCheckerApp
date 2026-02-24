interface PalindromeStrategy{
   boolean check(String word);
}
class StackStrategy implements PalindromeStrategy{
   public boolean check(String word){
       long start=System.nanoTime();
       java.util.Stack<Character> stack=new java.util.Stack<>();
       for(char c:word.toCharArray()){
           stack.push(c);
       }
       for(char c:word.toCharArray()){
           if(stack.pop()!=c){
               return false;
           }
       }
       long end=System.nanoTime();
       System.out.println("Execution time for stack strategy: "+(end-start)+"ns");
       return true;
   }
}
class DequeStrategy implements PalindromeStrategy{
   public boolean check(String word){
       long start=System.nanoTime();
       java.util.Deque<Character> deque=new java.util.ArrayDeque<>();
       for(char c:word.toCharArray()){
           deque.add(c);
       }
       while(deque.size()>1){
           if (deque.removeFirst()!=deque.removeLast()){
               return false;
           }
       }
       long end=System.nanoTime();
       System.out.println("Execution time for deque strategy: "+(end-start)+"ns");
       return true;
   }
}
class LinkedListStrategy implements PalindromeStrategy{
   public boolean check(String word){
       long start=System.nanoTime();
       java.util.LinkedList<Character> list=new java.util.LinkedList<>();
       for(char c:word.toCharArray()){
           list.add(c);
       }
       boolean palindrome=true;
       while(list.size()>1){
           if (list.removeFirst()!=list.removeLast()) {
               return false;
           }
       }
       long end=System.nanoTime();
       System.out.println("Execution time for linked list strategy: "+(end-start)+"ns");
       return true;
   }
}
public class UseCase13PalindromeCheckerApp{
   public static void main(String[] args){
       StackStrategy stack=new StackStrategy();
       DequeStrategy deque=new DequeStrategy();
       LinkedListStrategy list=new LinkedListStrategy();
       String word="level";
       System.out.println("Input text: "+word);
       System.out.println("Is it a palindrome (Stack Strategy)?: "+stack.check(word));
       System.out.println("Is it a palindrome (Deque Strategy)?: "+deque.check(word));
       System.out.println("Is it a palindrome (Linked List Strategy)?: "+list.check(word));
   }
}
