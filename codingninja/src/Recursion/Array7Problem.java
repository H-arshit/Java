package Recursion;

import java.util.Scanner;

public class Array7Problem
{
	public static boolean CheckFor7(int arr[])
	{
		if(arr.length==0)
		{
			return false;
		}
		if(arr[0]==7)
		{
			return true;
		}
		int arr1[]=new int [arr.length-1];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=arr[i+1];
		}
		boolean s=CheckFor7(arr1);
		return s;
				
	}
	public static int FirstIndexOf7(int arr[])
	{
		if(arr.length==0)
		{
			return -1;
		}
		if(arr[0]==7)
		{
			return 0;
		}
		int arr1[]=new int[arr.length-1];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=arr[i+1];
		}
		int i=FirstIndexOf7(arr1);
		if(i==-1)
			return -1;
		++i;
		return i;
		
	}
	public static int LastIndexOf7(int arr[])
	{
		if(arr.length==0)
		{
			return Integer.MIN_VALUE;
		}
		
		int arr1[]=new int[arr.length-1];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=arr[i+1];
		}
		int i=LastIndexOf7(arr1);
		++i;
		
		if(arr[0]==7)
		{
			if(i<=0)
				return 0;
			
		}
		if(i<0)
		{
			return -2;
		}
		return i;
		
		
		
	}
	public static int AllIndexOfSeven(int arr[],int allIndex[],int i)
	{
		if(arr.length==0)
		{
			return i;
		}
		int arr1[]=new int [arr.length-1];
		for(int z=0;z<arr1.length;z++)
		{
			arr1[z]=arr[z+1];
		}
		
		i=AllIndexOfSeven(arr1, allIndex, i);
		if(arr[0]==7)
		{	i=i+1;
			allIndex[i]=-1;
		}
		
		if(i!=-1)
		{
			for(int z=0;z<=i;z++)
		
		{
			allIndex[z]++;
		}
		}
		return i;
	}
	public static void main(String[] args) {
		System.out.println("enter the size of the array");
		Scanner s=new Scanner(System.in);
		int arr[]=new int [s.nextInt()];
		System.out.println("fill the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println(CheckFor7(arr));
		System.out.println("First index of 7 =  "+FirstIndexOf7(arr));
		System.out.println("Last index of 7 = "+LastIndexOf7(arr));
		int allIndex[]=new int[arr.length];
		int z=AllIndexOfSeven(arr, allIndex,-1);
		
		for(int i=0;i<=z;i++)
		{
			System.out.print(allIndex[i]+" ");
		}
	}
}
