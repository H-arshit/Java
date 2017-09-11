package Recursion;
import java.util.Scanner;
public class MergeSort {
	public static void Merge(int arr[], int begin, int mid, int end) {
		int a[] = new int[mid - begin + 1], b[] = new int[end - mid];
		for (int i = 0; i < a.length; i++) {
			a[i] = arr[begin + i];
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = arr[mid + 1 + i];
		}
		int k = begin;
		for (int i = 0, j = 0; i != a.length || j != b.length;) {
			if (i == a.length) {
				arr[k++] = b[j++];

			} else if (j == b.length) {
				arr[k++] = a[i++];

			} else if (a[i] < b[j]) {
				arr[k++] = a[i++];
			} else {
				arr[k++] = b[j++];
			}
		}
	}

	public static void Sort(int arr[], int begin, int end) {

		if (end == begin) {
			return;
		}

		int mid = (begin + end) / 2;
		Sort(arr, begin, mid);
		Sort(arr, mid + 1, end);
		Merge(arr, begin, mid, end);
		return;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[s.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		Sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
