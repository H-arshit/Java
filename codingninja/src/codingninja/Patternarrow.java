package codingninja;

import java.util.Scanner;

public class Patternarrow {
	public static void arrow(int n)
	{	int j,i;
		for(i=0;i<(n/2+1);i++)
		{
			for(j=0;j<i;j++)
				System.out.print(" ");
			for(j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		for(;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
				System.out.print(" ");
			for(j=0;j<n-i;j++)
				System.out.print("*");
			System.out.println();
		}

	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		arrow(n);
		s.close();
			}
}
