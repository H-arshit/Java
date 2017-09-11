package codingninja;

import java.util.Scanner;

public class ColumninExcel 
{
	public static int excelcol(String s)
	{	int z=0,h=1,i=s.length();
		char a;
		int val;
		for(int j=0;j!=i;j++)
		{
			a=s.charAt(j);
			val=a-'A'+1;
			h=1;
			for(int k=1;k<=(j);k++)
			{
				h=h*26;
			}
			h=h*val;
			z=z+h;		
		}
		
		
		
		return z;
	}
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
String i=s.next();
s.close();
int z=excelcol(i);
System.out.println(z);
}
}
