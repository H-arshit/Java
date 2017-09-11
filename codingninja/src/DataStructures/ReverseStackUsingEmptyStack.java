package DataStructures;

public class ReverseStackUsingEmptyStack 
{
	public static<T> void reverse(StackUsingLinkedList<T> stack1,StackUsingLinkedList<T> stack2) throws EmptyStackException
	{
		if(stack1==null)
		{
			return ;
		}
		stack2.push(stack1.pop());
		
	}	
}
