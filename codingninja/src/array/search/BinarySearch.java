package array.search;

import java.util.Scanner;

public class BinarySearch {

	public static void fill(int arr[])
	{	Scanner s=new Scanner(System.in);

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
	}
	public static int Search(int arr[],int num)
	{
		int start=0,end=arr.length-1,mid=0;
		while(start<=end)
		{
			mid=(start+end)/2;
			if(arr[mid]==num)
			{
				return mid;
			}
			else if(arr[mid]>num)
			{
				end=mid-1;
			}
			else
			{
				start=start +1;
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
