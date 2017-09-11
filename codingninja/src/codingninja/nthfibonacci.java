package codingninja;

import java.util.Scanner;

public class nthfibonacci {
	public static int fab(int x)
	{
		int a=0,b=1,c=a+b;
		int y=1;
		while(y<x)
		{
			c=a+b;
			a=b;
			b=c;
			y=y+1;
		}
		return a;
	
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		s.close();
		System.out.println(fab(x));
	}
}
