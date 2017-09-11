package DataStructures;

public class StackUsingTwoQueues <T>
{
	private QueueUsingLinkedList<T> q1,q2;
	public StackUsingTwoQueues() 
	{
		q1=new QueueUsingLinkedList<T>();
		q2=new QueueUsingLinkedList<T>();
	}
	public void push(T element)
	{
		q1.enqueue(element);
	}
	public T pop()
	{
		
		T data;
		try {
		while(q1.size()>1)
		{
			q2.enqueue(q1.dequeue());
		}
		
			data=q1.dequeue();
			QueueUsingLinkedList<T> temp=q1;
			q1=q2;
			q2=temp;
			return data;
		} catch (QueueEmptyException e) {
			System.out.println("Stack Empty");
			return null;
		}

		
	}
	public T top()
	{
		T data;
		try {
		while(q1.size()>1)
		{
			q2.enqueue(q1.dequeue());
		}
		
			data=q1.front();
			q2.enqueue(q1.dequeue());
			QueueUsingLinkedList<T> temp=q1;
			q1=q2;
			q2=temp;
			return data;
		} catch (QueueEmptyException e) {
			System.out.println("Stack Empty");
			return null;
		}

	}
	public int size() {
		return q1.size();
		
	}
	public boolean isEmpty() {
		return size()==0;
	}
}
