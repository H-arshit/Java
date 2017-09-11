package DataStructures;

import java.util.Scanner;

public class BalancedParanthesisCheck 
{
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	
	String str=s.next();
	int i=0;
	StackUsingLinkedList<Character> stack1= new StackUsingLinkedList<Character>(); 
	while(i<str.length())
	{
	if(str.charAt(i)=='{'|| str.charAt(i)=='(' || str.charAt(i)=='[')
		{
			stack1.push(str.charAt(i));
		}
	else if(str.charAt(i)=='}' || str.charAt(i)==']' || str.charAt(i)==')')
		{
			char ele;
			try {
				ele = stack1.pop();
				if(!(ele=='{' && str.charAt(i)=='}' || ele=='[' && str.charAt(i)==']'|| ele=='(' && str.charAt(i)==')'))
				{
					System.out.println("false");
					return;	
				}
			} catch (EmptyStackException e) {
				System.out.println("false");
				return;
			}
			
		}
	i++;
		
	}
	
	System.out.println(stack1.isEmpty());
}
}