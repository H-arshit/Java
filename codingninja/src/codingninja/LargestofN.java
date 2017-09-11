package codingninja;

import java.util.Scanner;

public class LargestofN {
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		int a=1;
		int max=-10000;
		while(a<=num)
		{	int x;
		x=s.nextInt();
		if(max<x)
		{
			max=x;
		}
		++a;
		}
		s.close();
		System.out.println(max);
	}
}
