package array;

import java.util.Scanner;

public class SumofArray 
{

	public static int sumarray(int arr[])
	{	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum+=arr[i];
	}
	return sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println(sumarray(arr));
	}
}
