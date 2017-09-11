package Recursion;

public class LexographicalPrint 
{
	
	public static void LexoPrint(int num ,int n)
	{
		if(num>n)
		{
			return; 
		}
		System.out.println(num);
		LexoPrint(num*10, n);
		if(num%10==9)
		{
			return;
		}
		num=num+1;
		
		LexoPrint(num, n);
	}
	public static void main(String[] args) 
	{
		LexoPrint(1,1000);	
		
	}
	
	
	
}
