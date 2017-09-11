package Recursion;
import java.util.Scanner;
public class MinimumElementInArray {
	public static int MinInArray(int arr[]) {
		if (arr.length == 0) {
			return Integer.MAX_VALUE;
		}

		if (arr.length == 1) {
			return arr[0];
		}
		int arr1[] = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			arr1[i] = arr[i + 1];
		}
		int min = MinInArray(arr1);
		if (min > arr[0])
			return arr[0];

		return min;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of ARRAY");
		int arr[] = new int[s.nextInt()];
		System.out.println("fill the array");
		for (int i = 0; i < arr.length; i++)
			arr[i] = s.nextInt();
		System.out.println(MinInArray(arr));

	}
}
