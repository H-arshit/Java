package codingninja;

import java.util.Scanner;

public class pattern4 {
	public static void main(String[] args) {


		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,j;
		char x='a'-1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i+1;j++)
			{
				System.out.print(((char)(x+j)));
			}

			for(j--;j!=0;j--)
			{
				System.out.print(((char)(x+j)));
			}
			System.out.println();
		}
		s.close();
	}
}
