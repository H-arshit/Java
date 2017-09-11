package Recursion;

import java.util.Scanner;

public class NumberIntoWords 
{
public static void NumtoWord(int n)
{

	String s[]=new String[10];
	s[0]="Zero";
	s[1]="One";
	s[2]="Two";
	s[3]="Three";
	s[4]="Four";
	s[5]="Five";
	s[6]="Six";
	s[7]="Seven";
	s[8]="Eight";
	s[9]="Nine";
	if(n<10)
	{	
		System.out.print((s[n%10])+" ");
		return;
	}
	NumtoWord(n/10);
	System.out.print((s[n%10])+" ");
	
}
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner s =new Scanner(System.in);
	NumtoWord(s.nextInt());
}
}
