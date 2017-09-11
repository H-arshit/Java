package array;

import java.util.Scanner;

public class Printinreverseorder {

	public static void revarray(int arr[])
	{
		for(int i=(arr.length-1);i>=0;i--)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
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
	revarray(arr);
}
}
