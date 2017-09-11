package multiArray;

import java.util.Scanner;

public class waveprint 
{
public static void takeinp()
{
	Scanner s=new Scanner(System.in);
	System.out.println("no of rows");
	int n=s.nextInt();
	System.out.println("no of col");
	int m=s.nextInt();
	int arr[][]=new int[n][m];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			arr[i][j]=s.nextInt();
		}
	}
	
	for(int i=0;i<m;i++)
	{
		if(i%2==0)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[j][i]);
			}
		}
		else
		{
			for(int j=m-1;j>=0;j--)
			{
				System.out.print(arr[j][i]);
			}
		}
	}
}
public static void main(String[] args) {
	takeinp();
}
}
