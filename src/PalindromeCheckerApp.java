public class UseCase8PalindromeCheckerApp{
    public static void main(String[] args){
        String word="level";
        LinkedList<Character> list=new LinkedList<>();
        for(char c:word.toCharArray()){
            list.add(c);
        }
        boolean palindrome=true;
        while(list.size()>1){
            if (list.removeFirst()!=list.removeLast()) {
                palindrome=false;
                break;
            }
        }
        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome?: "+palindrome);
    }
}
