package array;

import java.util.Scanner;

public class MaxSumPath {
	public static void Maxpath(int arr1[],int arr2[])
	{

		int sum1=0,sum2=0,sum=0;
		for(int i=0,j=0;i<arr1.length || j<arr2.length;)
		{
			if(j==arr2.length)
			{
				sum1=sum1+arr1[i];
				i++;
			}
			else if(i==arr1.length)
			{
				sum2=sum2+arr2[j];
				j++;
			}
			else if(arr1[i]==arr2[j])
			{
				if(sum1>sum2)
				{
					sum=sum+sum1;
				}
				else
				{
					sum=sum+sum2;
				}
				sum1=0;
				sum2=0;
				sum=sum+arr1[i];

				i++;
				j++;
			}
			else if(arr1[i]<arr2[j])
			{
				sum1+=arr1[i];
				i++;
			}
			else
			{
				sum2+=arr2[j];
				j++;	
			}
		}
		if(sum1>sum2)
			sum=sum+sum1;
		else
		{
			sum+=sum2;
		}
		System.out.println(sum);

	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size for first array");
		int n=s.nextInt();
		int arr1[]=new int[n];
		System.out.println("enter values");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=s.nextInt();
		}
		System.out.println("enter size for second array");
		n=s.nextInt();
		int arr2[]=new int[n];
		System.out.println("enter values");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=s.nextInt();
		}
		Maxpath(arr1, arr2);




	}

}
