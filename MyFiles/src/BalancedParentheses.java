import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
public static void main(String[] args) {
	
	Scanner obj=new Scanner(System.in);
	String p=obj.next();

	System.out.println(isBalanced(p));
}

static boolean isBalanced(String s)
{
	Stack<Character> stack=new Stack<Character>();
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='(' || s.charAt(i)=='{' ||s.charAt(i)=='[')
			stack.push(s.charAt(i));
		
		else {
			
			//it is a closing brace
			if(stack.isEmpty())
				return false;
			
			else if(stack.peek()=='(' && s.charAt(i)==')')
				stack.pop();
			
			else if(stack.peek()=='{' && s.charAt(i)=='}')
				stack.pop();
			
			else if(stack.peek()=='[' && s.charAt(i)==']')
				stack.pop();
			
			else return false;
			
		}
		
	}
	
	
	if(stack.isEmpty())
		return true;
	
	else return false;
	
}

}
