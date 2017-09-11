package array.sorting;

import java.util.Scanner;

public class SelectionSort {
	public static void fill(int arr[])
	{	Scanner s=new Scanner(System.in);
	
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
	}
	public static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	}
	public static void SelectSort(int arr[])
	{
		for(int j=0;j<arr.length-1;j++)
		{
		int min=arr[j];
		int k=j;
		for(int i=j;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
				k=i;
			}
		}
		arr[k]=arr[j];
		arr[j]=min;
		}
		
	}
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
	int size=s.nextInt();
	int arr[]=new int[size];
	fill(arr);
	SelectSort(arr);
	print(arr);

	
	}

}
