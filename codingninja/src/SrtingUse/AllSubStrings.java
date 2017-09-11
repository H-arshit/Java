package SrtingUse;

import java.util.Scanner;

public class AllSubStrings 
{
	public static void prisubstring(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
				System.out.println(s.substring(i,j));
			
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		prisubstring(str);
	}

}

