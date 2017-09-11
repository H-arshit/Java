package Recursion;

import java.util.Scanner;

public class BinarySearch 
{
	public static int Search(int arr[],int begin,int end,int x)
	{
		if(begin>end)
		{
			return -1;
		}
		int mid=(begin+end)/2;
		if(arr[mid]==x)
		{
			return mid;
		}
		else if(x>arr[mid])
		{
			return Search(arr,mid+1,end,x);
		}
		else
		{
			return Search(arr,begin,mid-1,x);
		}
	
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int arr[]=new int [s.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println(Search(arr, 0, arr.length-1, 10));
	}
}
