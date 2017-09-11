package Recursion;

public class AllSubSequence {
	public static String[] Allsubsequence(String s) {
		String Strs[] = new String[1];
		if (s.length() == 0) {
			Strs[0] = "";
			return Strs;
		}
		Strs = Allsubsequence(s.substring(1, s.length()));
		String nestr[] = new String[Strs.length * 2];
		int l = 0;
		for (int i = 0; i < 2; i++) {
			for (int k = 0; k < Strs.length; k++) {
				if (i % 2 == 0) {
					nestr[l++] = Strs[k];
				} else {
					nestr[l++] = s.charAt(0) + Strs[k];
				}
			}
		}

		return nestr;
	}
	public static void print(String input,String sofar)
	{
		if(input.length()==0)
		{
			System.out.println(sofar);
			return;
		}
		print(input.substring(1,input.length()),sofar+input.charAt(0));
		print(input.substring(1,input.length()),sofar);
	}
	public static void main(String[] args) {
		String s[] = Allsubsequence("abc");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		print("abc","");
	}
}
