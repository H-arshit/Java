package SrtingUse;

import java.util.Scanner;

public class StringRevAllTypes {

	public static String revtype1(String str)
	{	String strrev="";

	for(int i=str.length()-1;i>=0;i--)
	{
		strrev+=str.charAt(i);
		//strrev=strrev.concat(str.substring(i,j)); //j=i+1
	}

	return strrev;
	}
	public static String Wordrevofstring(String str)
	{
		String revstr="";
		for(int i=0;i<=str.length();i++)
		{	if(i==str.length() || str.charAt(i)==' ')
				{	for(int j=i-1;str.charAt(j)!=' ';j--)
					
					{
					revstr=revstr+str.charAt(j);
					if(j==0)
					{
						break;
					}
					}
					if(i!=str.length())
					{
					revstr=revstr+str.charAt(i);
					}
					
				}
		}
		return revstr;
	}
	public static String revtype3(String str)
	{
		String rev="";
		for(int i=str.length()-1,j=str.length();i>=0;i--)
		{
			if(i==0)
			{
				rev=rev+str.substring(i,j);
				break;
			}
			else if(str.charAt(i)==' ')
			{
				rev=rev+str.substring(i+1,j);
				rev=rev+str.charAt(i);
				j=i;
			}
				
		}
		return rev;
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String revstr=revtype1(str);
		System.out.println(revstr);
		String rev1=Wordrevofstring(str);
		System.out.println(rev1);
		String rev=revtype3(str);
		System.out.println(rev);
		
	}

}
