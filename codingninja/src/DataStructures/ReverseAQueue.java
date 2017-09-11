package DataStructures;

public class ReverseAQueue 
{
	public static<T> void reverseaqueue(QueueUsingLinkedList<T> q1)
	{
		if(q1.size()==0 || q1.size()==1)
		{
			return ;
		}
		
		
		try {
			T dataofnode=q1.dequeue();
			 reverseaqueue(q1);
			 q1.enqueue(dataofnode);
			 return;
		} catch (QueueEmptyException e) {
			
			return;
		}
		
		
	}
	public static void main(String[] args) throws QueueEmptyException {
		QueueUsingLinkedList<Integer> q1=new QueueUsingLinkedList<Integer>();
		for(int i=0;i<10;i++)
		{
			q1.enqueue(i);
		}
		reverseaqueue(q1);
		for(int i=0;i<10;i++)
		{
			System.out.println(q1.dequeue());
		}
	}

}
