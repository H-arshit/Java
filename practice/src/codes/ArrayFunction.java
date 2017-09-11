package codes;

import java.util.Scanner;

public class ArrayFunction 
{
	public static int[] input()
	{
		Scanner s=new Scanner(System.in);
		int arr[]=new int[s.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		return arr;
	}
}
