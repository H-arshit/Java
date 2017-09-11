package array;

import java.util.Scanner;

public class LinearSearch {

	public static void fill(int arr[])
	{	Scanner s=new Scanner(System.in);

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
	}
	public static int Search(int arr[],int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				return i;
			}
		}
	return -1;
		
	}
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
	int size=s.nextInt();
	int arr[]=new int[size];
	fill(arr);
	System.out.println("enter the element to be searched");
	int num=s.nextInt();
	System.out.println("the index of the element is");
	System.out.println(Search(arr,num));
	
	}

}
