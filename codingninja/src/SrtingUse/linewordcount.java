package SrtingUse;

import java.util.Scanner;

public class linewordcount {
	public static void count(String s)
	{	
	int line=1,words=1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='\n')
			{
				line++;
				words++;
			}
			else if(s.charAt(i)==' ')
				{
				words++;
				}				
		}
		System.out.println("characters "+(s.length()-words));
		System.out.println("words"+(words));
		System.out.println("lines"+(line));
		return;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		s.useDelimiter(",");
		String str=s.next();
		count(str);
		
	}
	

}
