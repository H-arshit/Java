package codingninja;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int rows=s.nextInt(),j,val=rows;
		s.close();
		for(int i=0;i<rows;i++,val=rows)
		{	for(j=0;j<i;j++)
		{
			System.out.print(val--);
		}
			for(j=0;j<rows-i;j++)
			{
				System.out.print(val);
			}
			System.out.println();
		}
	}
}
