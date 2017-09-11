package codes;
import java.util.Scanner;

public class spiralprint
{
	public static void takeinp()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("no of rows");
		int n=s.nextInt();
		System.out.println("no of col");
		int m=s.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}

		int l=0,z=0,i=0;
		m=m-1;
		n=n-1;
		while(l<=n && z<=m)
		{
		for(i=z;i<=m;i++)
		{
			System.out.print(arr[l][i]+" ");
		}
		l++;
		for(i=l;i<=n;i++)
		{
			System.out.print(arr[i][m]+" ");
		}
		m--;
		for(i=m;i>=z;i--)
		{
			System.out.print(arr[n][i]+" ");
		}
		n--;
		for(i=n;i>=l;i--)
		{
			System.out.print(arr[i][z]+" ");
		}
		z++;
		}
	}
	public static void main(String[] args) {
		takeinp();
	}
}
