package codingninja;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i=s.nextInt();
		s.close();
		int a=1;
		while(a<=i)
		{	int col=1;
		while(col<=i-a)
		{
			System.out.print(" ");
			col=col+1;
		}
		col=1;
		int val=a;
		while(col<=a)
		{

			System.out.print(val);
			val=val+1;
			col=col+1;
		}

		System.out.println();
		a=a+1;
		}
	}
}
