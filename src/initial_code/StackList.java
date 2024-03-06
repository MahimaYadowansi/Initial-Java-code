package initial_code;
import java.util.*;
public class StackList {

	public static void main(String[] args) {
	Stack<String> stack=new Stack<>();
	
	stack.push("mango");
	stack.push("apple");
	stack.push("banana");
	stack.push("kiwi");
	
	System.out.println(stack);
	stack.pop();
	System.out.println(stack);
	stack.peek();
	System.out.println(stack);
	if(stack.isEmpty())
	{
		System.out.println("The stack is empty");
		
	}
	else
	{
		System.out.println("The stack is not empty");
	}
	}

}
