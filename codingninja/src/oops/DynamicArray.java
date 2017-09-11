package oops;

public class DynamicArray 
{
	private int nextindex;
	private int arr[];
	public DynamicArray()
	{
		arr=new int [5];
		nextindex=0;
	}
	public boolean Isempty()
	{
		if(nextindex==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public int removelast()
	{
		if(nextindex==0)
		{
			return -1;
		}
		else 
		{
			int removed=arr[nextindex-1];
			nextindex--;
			return removed;
			
		}
	}
	public void restructure()
	{
		int temp[]=arr;
		arr=new int [arr.length*2];
		for(int i=0;i<temp.length;i++)
		{
			arr[i]=temp[i];
		}
		
	}
	public void add(int element)
	{
		if(nextindex==arr.length)
		{
			restructure();
		}
		arr[nextindex]=element;
		nextindex++;
	}
	public int size()
	{
		return nextindex;
	}
	public int get(int index)
	{
		if(index >= nextindex)
		{
			return -1;
		}
		return arr[index];
	}
	public void set(int index,int element)
	{
		if(index>nextindex)
		{
			return;
		}
		else if(index<nextindex)
		{
			arr[index]=element;
		}
		else 
		{
			add(element);
		}
	}
}
