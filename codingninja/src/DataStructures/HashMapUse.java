package DataStructures;

public class HashMapUse {

	public static void main(String[] args) {
		Map<Integer, Integer> mymap = new Map<Integer, Integer>();

		mymap.add(1, 11);
		mymap.add(12, 11);
		mymap.add(3, 12);
		mymap.remove(1);
		System.out.println(mymap.get(1));
		mymap.add(12, 11);
	}
}
