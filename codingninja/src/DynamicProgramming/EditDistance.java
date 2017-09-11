package DynamicProgramming;

public class EditDistance {

	public static int findeditrecursive(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}
		if (s1.charAt(0) == s2.charAt(0)) {
			return findeditrecursive(s1.substring(1), s2.substring(1));
		} else {
			int option1 = 1 + findeditrecursive(s1.substring(1), s2);
			int opt2 = 1 + findeditrecursive(s1, s2.substring(1));
			int opt3 = 1 + findeditrecursive(s1.substring(1), s2.substring(1));
			return Math.min(Math.min(option1, opt2), opt3);
		}
	}
	public static int editdistanceiterative(String s1,String s2)
	{
		int output[][]=new int [s1.length()+1][s2.length()+1];
		for(int i=0;i<=s1.length();i++)
		{
		output[i][0]=i;
		}
		for(int i=0;i<=s2.length();i++)
		{
			output[0][i]=i;
		}
		for(int i=1;i<=s1.length();i++)
		{
			for(int j=1;j<=s2.length();j++)
			{
				if(s1.charAt(s1.length()-i)==s2.charAt(s2.length()-j))
				{
					output[i][j]=output[i-1][j-1];
				}
				else
				{
					output[i][j]=1+(Math.min(Math.min(output[i-1][j],output[i][j-1]), output[i-1][j-1]));
				}
			}
		}
		
		return output[s1.length()][s2.length()];
	}

	public static void editdistancedp(String s1,String s2)
	{
	}
	public static void main(String[] args) {
		//System.out.println(findeditrecursive("abcdsFajsdhdkd", "dabckjhfkhvkjfdj"));
		System.out.println(editdistanceiterative("abcdsFajsdhdkd","dabckjhfkhvkjfdj"));
		System.out.println(editdistanceiterative("dabckjhfkhvkjfdj","abcdsFajsdhdkd"));

	}
}
