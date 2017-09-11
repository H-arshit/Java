package codingninja;

import java.util.Scanner;

public class Prime {
	public static void prm(int b)
	{	int a;
		int x=2;
		while(x<=b)
		{
			a=2;
			while(a<x)
			{
				if(x%a==0)
				{
					break;
				}
				a++;
			}
			if(a==x)
			{
				System.out.println(x);
			}
			x++;

		}

	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		prm(b);
		s.close();
			}

}
