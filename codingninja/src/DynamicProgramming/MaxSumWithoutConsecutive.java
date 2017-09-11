package DynamicProgramming;

public class MaxSumWithoutConsecutive {

	public static int helpersum(int arr[],int startindex,int sum[])
	{
		if(startindex>=arr.length)
		{
			sum[arr.length]=0;
			return 0;
		}
		if(sum[startindex]!=0)
		{
			return sum[startindex];
		}
		int option1=arr[startindex]+helpersum(arr, startindex+2, sum);
		int option2=helpersum(arr, startindex+1, sum);
		sum[startindex]=Math.max(option1,option2);
		return sum[startindex];
	}
	public static void findsum(int arr[])
	{
		int sum[]=new int [arr.length+1];
		System.out.println(helpersum(arr,0,sum ));
		
	}
	public static void main(String[] args) {
		int arr[]={1000,2,2000,3,5,10000};
		findsum(arr);
	}
}
