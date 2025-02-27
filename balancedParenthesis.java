import java.util.*;
class Solution{
	public static boolean isBalanced(String s){
        if(s.length() == 0){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '(':
                case '[':
                case '{': 
                        stack.push(s.charAt(i));
                        break;
                case ')': if(stack.isEmpty() || !stack.pop().equals('('))
                                return false;
                        break;
                case ']': if(stack.isEmpty() || !stack.pop().equals('['))
                                return false;
                        break;
                case '}': if(stack.isEmpty() || !stack.pop().equals('{'))
                                return false;
                        break;
                default:
                        return false;
            }
        }
        return stack.isEmpty();
    }
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack<>();
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            System.out.println(isBalanced(input));
		}
		
	}
}


/*
Input:
{}()
({()})
{}(
[]

Output:
true
true
false
true

*/

