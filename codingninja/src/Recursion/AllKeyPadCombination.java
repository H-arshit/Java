package Recursion;

public class AllKeyPadCombination {
	public static String Keypad(char num) {
		if (num == '2') {
			return "abc";
		} else if (num == '3') {
			return "def";
		} else if (num == '4') {
			return "ghi";
		} else if (num == '5') {
			return "jkl";
		} else if (num == '6') {
			return "mno";
		} else if (num == '7') {
			return "pqrs";
		} else if (num == '8') {
			return "tuv";
		} else {
			return "wxyz";
		}
	}
	public static void PrintAllCombinations(String num,String sofar)
	{
		if(num.length()==0)
		{
			System.out.println(sofar);
			return;
		}
		String str=Keypad(num.charAt(num.length()-1));
		for(int i=0;i<str.length();i++)
		{	
			PrintAllCombinations(num.substring(0, num.length()-1),str.charAt(i)+ sofar);
		}
	}
	public static String[] Allcombinations(String num)
	{
		if(num.length()==0)
		{
			String s[]=new String[1];
			s[0]="";
			return s;
		}
		String outone[]=Allcombinations(num.substring(1));
		String has=Keypad(num.charAt(0));
		String newout[]=new String[outone.length*has.length()];
		int k=0;
		for(int i=0;i<has.length();i++)
		{
			for(int j=0;j<outone.length;j++)
			{
				newout[k++]=has.charAt(i)+outone[j];
			}
		}
		return newout;
		
	}
	public static void main(String[] args) {
		String s[]=Allcombinations("73");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		System.out.println("new method");
		PrintAllCombinations("73","");
	}
	

}
