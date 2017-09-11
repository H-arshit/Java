package oops;

public class UseDynamicArrray 
{
	public static void main(String[] args) {
		
	DynamicArray arr=new DynamicArray();
	for(int i=0;i<1000;i++)
	{
		arr.add(i);
	}
	for(int i=arr.size()-1;i>=0;i--)
	{
		System.out.println(arr.removelast());
	}
	}
}
