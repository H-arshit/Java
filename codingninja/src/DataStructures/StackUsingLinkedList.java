package DataStructures;

public class StackUsingLinkedList<T> 
{
	private GenericNode<T> head;
	int size;
	public StackUsingLinkedList() {
		head=null;
		size=0;
	}
	public int size() {
		return size;

	}
	public boolean isEmpty()
	{
		return size()==0;
	}
	public void push(T element)
	{
		GenericNode<T> temp=new GenericNode<T>(element);
		temp.next=head;
		head=temp;
		size++;
	}
	public T pop() throws EmptyStackException
	{
		if(size()==0)
		{
			throw new EmptyStackException();
		}
		T deleteddata;
		deleteddata=head.data;
		head=head.next;
		size--;
		return deleteddata;
	}
	public T top() throws EmptyStackException
	{
		if(size()==0)
		{
			throw new EmptyStackException();
		}
		T topdata;
		topdata=head.data;
		return topdata;
	}
}
