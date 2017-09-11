package codes;

public class TwoArraySubset {
	public static void print(int arr1[], int arr2[], int sofar[], int i, int j,
			int k) {
		if (k == 1) {
			if (arr1[i] > arr2[j]) {
				int newsofar[] = new int[sofar.length + 1];
				for (int z = 0; z < sofar.length; z++) {
					newsofar[z] = sofar[z];
				}
				newsofar[sofar.length] = arr2[j];
				j++;
				print(arr1, arr2, newsofar, i, j, 2);
			}
		}
		if (k == 2) {
			if (arr1[i] < arr2[j]) {
				int newsofar[] = new int[sofar.length + 1];
				for (int z = 0; z < sofar.length; z++) {
					newsofar[z] = sofar[z];
				}
				newsofar[sofar.length] = arr1[i];
				i++;
				print(arr1, arr2, newsofar, i, j, 1);
			}

		}

	}

	public static int count(int arr1[], int arr2[]) {
		int empty = 1;
		int first = 0, second = 0;
		int i = 0, j = 0;
		while (i != arr1.length || j != arr2.length) {
			if (i == arr1.length) {
				second = (first * (arr2.length - j))
						+ (empty * (arr2.length - j)) + second;
				j = arr2.length;
			} else if (j == arr2.length) {
				first = first + (empty * (arr1.length - i))
						+ (second * (arr1.length - i));
			}

			else if (arr1[i] < arr2[j]) {
				first = empty + first + second;
				i++;
			} else if (arr1[i] > arr2[j]) {
				second = second + empty + first;
				j++;
			}

		}
		return empty + first + second;

	}

	public static void main(String[] args) {
		int arr1[] = ArrayFunction.input(), arr2[] = ArrayFunction.input();
		System.out.println(count(arr1, arr2));

	}
}
