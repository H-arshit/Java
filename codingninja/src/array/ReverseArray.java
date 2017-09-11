package array;

import java.util.Scanner;

public class ReverseArray {
	public static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	}
	public static void fill(int arr[])
	{	Scanner s=new Scanner(System.in);

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
	}
	public static void revarr(int arr[])
	{
		int p=0;
		for(int i=0, j=arr.length-1;i<=j;i++,j--)
		{
			p=arr[i];
			arr[i]=arr[j];
			arr[j]=p;
		}
		
	}
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
	int size=s.nextInt();
	int arr[]=new int[size];
	fill(arr);
	revarr(arr);
	print(arr);
	}

}
