package SrtingUse;

import java.util.Scanner;

public class Highestoccuringcharacter 
{
	public static void Countstr(String str)
	{
		int var[]=new int[str.length()];
		String count="";
		int k=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<k;j++)
			{
				if(str.charAt(i)==count.charAt(j))
				{
					var[j]++;
					break;
				}
			}
			if(i==k)
			{
				count=count+str.charAt(i);
				k++;
			}
		}
		int max=Integer.MIN_VALUE,index=0;
		for(int i=0;i<k;i++)
		{
			if(max<var[i])
			{
				max=var[i];
				index=i;
			}
		}
		System.out.println(str.charAt(index));


	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		Countstr(str);
	}
}
