package DataStructures;

public class QueueUsingArray 
{
	private int data[];
	private int startindex,nextindex;
	private int length;
	public QueueUsingArray()
	{
		data=new int[5];
		startindex=-1;
		nextindex=0;
		length=0;
	}
	public int size()
	{
		return length;
	}
	private void resize()
	{
		int temp[]=data;
		data=new int[temp.length*2];
		int k=0;
		for(int i=startindex;i<temp.length;i++)
		{
			data[k++]=temp[i];
		}
		for(int i=0;i<startindex;i++)
		{
			data[k++]=temp[i];
		}
		startindex=0;
		nextindex=k;
	}
	public void enqueue(int element)
	{
		if(size()==data.length)
		{
			resize();
		}
		data[nextindex]=element;
		if(size()==1)
		{
			startindex=0;		}
		nextindex=(nextindex+1)%data.length;	
		length++;
	}
	public int dequeue() throws QueueEmptyException
	{
		if(size()==0)
		{
			throw new QueueEmptyException();
		}
		int dataremoved=data[startindex];
		startindex=(startindex+1)%data.length;
		length--;
		if(length==0)
		{
			startindex=-1;
			nextindex=0;
		}
		return dataremoved;
	}
	public int frontelement() throws QueueEmptyException
	{
		if(size()==0)
		{
			throw new QueueEmptyException();
		}
		return data[startindex];
	}
	public boolean isEmpty()
	{
		return size()==0;
	}
	


	public static void main(String[] args) throws QueueEmptyException {
		QueueUsingArray q1=new QueueUsingArray();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		System.out.println(q1.dequeue());
		q1.enqueue(40);
		q1.enqueue(50);
		q1.enqueue(60);
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		q1.enqueue(60);
		q1.enqueue(70);
		q1.enqueue(80);
		q1.enqueue(90);
		q1.enqueue(100);
		q1.enqueue(110);
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		
	}
}	
