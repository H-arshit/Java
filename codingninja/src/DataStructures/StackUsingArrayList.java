package DataStructures;

import java.util.ArrayList;

public class StackUsingArrayList<E> 
{
	ArrayList<E> stack;
	public StackUsingArrayList() {
		stack=new ArrayList<>();
	}
	public int size()
	{
		return stack.size();
	}
	public void push(E element)
	{
		stack.add(element);
	}
	public E top() 
	{
		return stack.get(size()-1);
	}
	public E pop()
	{
		E rem=top();
		stack.remove(size()-1);
		return rem;
	}
	public boolean isEmpty()
	{
		return stack.isEmpty();
	}
public static void main(String[] args) throws EmptyStackException {
	StackUsingLinkedList<Integer> sk=new StackUsingLinkedList<Integer>();
	sk.push(10);
	System.out.println(sk.top());
	System.out.println(sk.size());
	System.out.println(sk.pop());
	System.out.println(sk.size());
	System.out.println(sk.pop());

}
}
