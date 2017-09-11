package DataStructures;
	public class QueueUsingLinkedList<T> 
	{
		private GenericNode<T> front,rear;
		private int length;
		public QueueUsingLinkedList() 
		{
			front=rear=null;
			length=0;
		}
		public boolean isEmpty()
		{
			return front==null;
		}
		public void enqueue(T element)
		{
			GenericNode<T> temp=new GenericNode<T>(element);
			if(rear==null)
			{
				front=rear=temp;
			}
			else
			{
			rear.next=temp;
			rear=temp;
		
			}
			length++;
		}
		public T dequeue() throws QueueEmptyException
		{
			if(front==null)
			{
				throw new QueueEmptyException();
			}
			T data=front.data;
			if(front==rear)
			{
				front=rear=null;
			}
			
			else 
				{front=front.next;}
			length--;
			return data;
			
		}
		public int size()
		{
			return length;
		}
		public T front() throws QueueEmptyException
		{
			if(front==null)
			{
				throw new QueueEmptyException();
			}
			
			return front.data;
		}
		
		public static void main(String[] args) {
			QueueUsingLinkedList<Integer> queue1=new QueueUsingLinkedList<>();
			try {
			System.out.println(queue1.size());
			queue1.enqueue(10);
			System.out.println(queue1.size());
			queue1.enqueue(20);
			System.out.println(queue1.size());
			queue1.enqueue(30);
			System.out.println(queue1.size());
			
				System.out.println(queue1.dequeue());
				System.out.println(queue1.front());
				System.out.println(queue1.dequeue());
				System.out.println(queue1.front());
				System.out.println(queue1.dequeue());
				System.out.println(queue1.front());
				System.out.println(queue1.dequeue());
				System.out.println(queue1.front());
				System.out.println(queue1.front());
				System.out.println(queue1.front());
				System.out.println(queue1.front());
			} catch (QueueEmptyException e) {
				System.out.println("Empty Queue");
				
			}
			
		}
	}
