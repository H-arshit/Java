package hashmap;

import java.util.HashMap;

public class InbuildHashMap {

	public static void intersectionOfArrays(int arr1[], int arr2[]) {
		HashMap<Integer, Void> findintersection = new HashMap<Integer, Void>();
		for (int i = 0; i < arr1.length; i++) {
			findintersection.put(arr1[i], null);
		}
		for (int i = 0; i < arr2.length; i++) {

			if (findintersection.containsKey(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}
	}

	public static void findpairsum(int arr[], int k) {
		HashMap<Integer, Integer> findpair = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			findpair.put(arr[i], i);
		}
		for (int i = 0; i < arr.length; i++) {
			if (findpair.containsKey(k - arr[i])
					&& findpair.get(k - arr[i]) > i) {
				System.out.println(arr[i] + " " + (k - arr[i]));
			}
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 2, 2, 2, -2, -2 }, arr2[] = { 2, 3, 5, 7, 8, 9 };
		// intersectionOfArrays(arr1, arr2);
		findpairsum(arr1, 0);
	}
}
