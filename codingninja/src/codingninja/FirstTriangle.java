package codingninja;

import java.util.Scanner;

public class FirstTriangle 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int Lines=s.nextInt();
		s.close();
		int a=1,b=1;
		while(a<=Lines)
		{	int col=1;
		while(col<=Lines-a)
		{
			System.out.print(" ");
			col=col+1;
		}
		col=1;
		while(col<=a)
		{
			System.out.print(b);

			b=b+1;
			col=col+1;
		}
		System.out.println();

		a=a+1;
		}

	}
}
