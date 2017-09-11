package Recursion;

public class PermutationsWithNoCorrectPos {

	public static void print(String input, char sofar[], int nopos) {
		if (nopos == input.length()) {
			System.out.println(sofar);
			return;
		}
		for (int i = 0; i != input.length(); i++) {
			if (i != nopos && sofar[i] == '\0') {
				sofar[i] = input.charAt(nopos);
				print(input, sofar, nopos + 1);
				sofar[i] = '\0';
			}

		}

	}
	public static char[][] returnprint(String input,char sofar[],int nopos)
	{
		if(nopos==input.length())
		{
			char[][] output=new char[input.length()-1][input.length()];
			for(int i=1,j=0;i<input.length();i++)
			{
				output[j][i]=input.charAt(nopos);
			}
			
		}
	}
	

	public static void main(String[] args) {
		print("abcd", new char[4], 0);
	}
}
