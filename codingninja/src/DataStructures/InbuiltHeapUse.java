package DataStructures;

import java.util.ArrayList;
import java.util.PriorityQueue;


public class InbuiltHeapUse {
	
	public static ArrayList<Integer> sortKsortedarray(ArrayList<ArrayList<Integer>> karrays )
	{
		ArrayList<Integer> finalsortedarray=new ArrayList<Integer>();
		PriorityQueue<Integer> mysortingheap=new PriorityQueue<Integer>();
		
	}

	public static void sortAlmostSorted(int arr[], int k) {
		PriorityQueue<Integer> myheap = new PriorityQueue<Integer>();
		for (int i = 0; i < k; i++) {
			myheap.add(arr[i]);
		}
		int z = 0;
		for (int i = k; i < arr.length; i++) {
			arr[z++] = myheap.remove();
			myheap.add(arr[i]);
		}
		while (myheap.size() != 0) {
			arr[z++] = myheap.remove();
		}
	}

	public static int[] kmaximum(int a[], int k) {
		PriorityQueue<Integer> myheap = new PriorityQueue<Integer>();
		for (int i = 0; i < k; i++) {
			myheap.add(a[i]);
		}
		for (int i = k; i < a.length; i++) {
			if (myheap.peek() < a[i]) {
				myheap.remove();
				myheap.add(a[i]);
			}
		}
		int arr[] = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = myheap.remove();
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 4, 5, 6 };
		sortAlmostSorted(arr, 3);
		;
		for (int element : arr) {
			System.out.println(element);
		}
	}

}
