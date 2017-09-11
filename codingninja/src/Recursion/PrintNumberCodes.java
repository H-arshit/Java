package Recursion;
public class PrintNumberCodes 
{
	public static char codes(int num)
	{
		return ((char)('a'+num-1));
	}
	public static void printcodes(int num,String sofar)
	{	if(num==0)
		{
		System.out.println(sofar);
		return;
		}
		printcodes(num/10, codes(num%10)+sofar);
		if(num%100<=26 &&num%100>=10)
		printcodes(num/100, codes(num%100)+sofar);
	}
	public static String[] retruningnumbercode(int num)
	{
		if(num==0)
		{
			String str[]=new String[1];
			str[0]="";
			return str;
		}
		String prev[]=retruningnumbercode(num/10);
		for(int i=0;i<prev.length;i++)
		{
			prev[i]=prev[i]+codes(num%10);
		}
		String newout[]=new String[0];
		if(num%100>=10 && num%100<=26)
		{
			newout=retruningnumbercode(num/100);
			for(int j=0;j<newout.length;j++)
			{
				newout[j]=newout[j]+codes(num%100);
			}
		}
		String str[]=new String[prev.length+newout.length];
		for(int k=0;k<prev.length;k++)
		{
			str[k]=prev[k];
		}
		for(int l=0;l<newout.length;l++)
		{
			str[l+prev.length]=newout[l];
		}
		return str;
		
	}
	public static void main(String[] args) {
		printcodes(11211,"");
	String str[]=retruningnumbercode(11211);
	System.out.println();
	for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i]);
	}
	}
}
