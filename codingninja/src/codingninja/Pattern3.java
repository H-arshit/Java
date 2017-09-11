package codingninja;

import java.util.Scanner;

public class Pattern3 {
	public static void pat(int a)
	{
		int i=1;
		while(i<=a)
		{
			int col=1;
			while(col<=a-i)
			{
				System.out.print(" ");
				col=col+1;
			}
		 int val=i;
		 	col=1;
		 	while(col<=i)
		 	{
		 		System.out.print(val);
		 		++val;
		 		++col;
		 	}
		 	val=val-2;
		 	col=1;
		 	while(col<=i-1)
		 	{
		 		System.out.print(val);
		 		++col;
		 		val--;
		 	}
		 	System.out.println();
			++i;
		}

	}
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int a=s.nextInt();
	s.close();
	pat(a);
	}
}
