package Recursion;
public class PrintAllStirngsOfLengthK 
{
	static int i=1;
	public static void Printallstring(String input,String sofar,int k)
	{
		if(k==0)
		{	System.out.print(i + " ");
			i++;
			System.out.println(sofar);
			return;
		}
		for(int i=0;i<input.length();i++)
		{
			Printallstring(input, sofar+input.charAt(i), k-1);
		}
	}
	
	
public static String[] Print(String str,int k)
{	
	if(k==0)
	{
		String output[]=new String[1];	
		output[0]="";
		return output ;
	}
	String prev[]=Print(str, k-1);
	String nextout[]=new String[prev.length*str.length()];
	int z=0;
	for(int i=0;i<str.length();i++)
	{
		for(int j=0;j<prev.length;j++)
		{
			nextout[z++]=str.charAt(i)+prev[j];
		}
	}
			
			
			
			
	return nextout;
	
	
	
}
public static void main(String[] args)
{
	Printallstring("hs", "", 3);
	System.out.println("method 2");
	String str[]=Print("hs",3);
	for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i]);
	}
	
}

}
