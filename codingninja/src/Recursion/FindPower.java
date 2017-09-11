package Recursion;

import java.util.Scanner;

public class FindPower 
{
	public static int Power(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		int ans=x*Power(x,n-1);
		return ans;
	}
	public static void main(String[] args) 
	{Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int x=s.nextInt();
	System.out.println("enter exponent");
	int n=s.nextInt();
	System.out.println(Power(x,n));
	}
}
