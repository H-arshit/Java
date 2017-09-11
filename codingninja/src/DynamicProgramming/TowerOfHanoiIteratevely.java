package DynamicProgramming;

public class TowerOfHanoiIteratevely {

	public static void printtower(int k, String source, String auxi, String dest) {

		if (k == 1) {
			System.out
					.println("shift " + k + " form " + source + " to " + dest);
			return;
		}
		printtower(k - 1, source, dest, auxi);
		System.out.println("shift " + k + " form " + source + " to " + dest);
		printtower(k - 1, auxi, source, dest);

	}

	public static void main(String[] args) {

		printtower(3, "a", "b", "c");

	}

}
