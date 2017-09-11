package array.sorting;

import java.util.Scanner;

public class MergeTwoSortedArrays 
{
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
	public static void merges(int arr1[],int arr2[],int arr3[])
	{	int i=0,j=0,k=0;
		while(i<arr3.length)
		{
			if(j<arr1.length && k<arr2.length)
			{
			if(arr1[j]<arr2[k])
			{
				arr3[i]=arr1[j];
				j++;
			}
			else
			{
				arr3[i]=arr2[k];
				k++;
			}
			}
			else
			{
				if(j==arr1.length)
				{
					arr3[i]=arr2[k];
					k++;
				}
				else
				{
					arr3[i]=arr1[j];
					j++;
				}
			}
		i++;
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array 1");
		int size1=s.nextInt();
		int arr1[]=new int[size1];
		System.out.println("enter size of array 2");
		int size2=s.nextInt();
		int arr2[]=new int[size2];
		fill(arr1);
		fill(arr2);
		int arr3[]=new int[(size1+size2)];
		merges(arr1,arr2,arr3);
		print(arr3);
	}	

}
