package codes;


public class PermutationsOfArray {
	static int i=1;
public static void printper(String str,String sofar)
{
	if(str.length()==0)
	{	System.out.print( i+" " );
		i++;
		System.out.println(sofar);
		
		return;
	}
	for(int i=0;i<str.length();i++)
	{
		printper(str.substring(0,i)+str.substring(i+1), sofar+str.charAt(i));
	}
}
public static void main(String[] args) 
{	
	printper("sdf","");

}

}
