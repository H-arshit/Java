package DataStructures;

public class StackUse {

	public static void main(String[] args) {
		
	
	StackUsingLinkedList<Integer> stack1=new StackUsingLinkedList<Integer>();
	System.out.println(stack1.size());
	System.out.println(stack1.isEmpty());

	try {
		System.out.println(stack1.pop());
	} catch (EmptyStackException e) {
		// TODO Auto-generated catch block
		//System.out.println("pop error");
		e.printStackTrace();
	}

	}
}