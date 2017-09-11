package codingninja;

import java.util.Scanner;

public class Pattern6
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
int n=s.nextInt(),val,j=1,i;
s.close();
for(i=1;i<=(n+1)/2;i++)
{
	for(val=1+((2*n)*(i-1)),j=1;j<=n;val++,j++)
		System.out.print(val+" ");
	System.out.println();
}
for(i=(n)/2;i>=1;i--)
{
	for(val=1+n+((2*n)*(i-1)),j=1;j<=n;val++,j++)
		System.out.print(val+" ");
	System.out.println();
}

}
}
