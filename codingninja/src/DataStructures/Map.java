package DataStructures;

import java.util.ArrayList;

class MapNode<K, V> {
	K key;
	V value;
	MapNode<K, V> next;

	MapNode(K key, V value) {
		this.key = key;
		this.value = value;
		next = null;
	}
}

public class Map<K, V> {
	int size, bucketsize;
	ArrayList<MapNode<K, V>> bucketlist;

	public Map() {
		size = 0;
		bucketsize = 11;
		bucketlist = new ArrayList<MapNode<K, V>>();
		for (int i = 0; i < bucketsize; i++) {
			bucketlist.add(null);
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int getBucketIndex(K key) {
		int code = key.hashCode();
		int compress = Math.abs(code) % bucketsize;
		return compress;
	}

	public void remove(K key) {

		int index = getBucketIndex(key);
		MapNode<K, V> temp = bucketlist.get(index);
		MapNode<K, V> prev = null;
		while (temp != null) {
			if (temp.key.equals(key)) {
				if (prev == null) {
					bucketlist.set(index, temp.next);
				} else {
					prev.next = temp.next;
				}
				size--;
				return;
			}
			prev = temp;
			temp = temp.next;
		}

	}

	public V get(K key) {
		int index = getBucketIndex(key);
		MapNode<K, V> temp = bucketlist.get(index);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;

	}

	public void add(K key, V value) {
		int index = getBucketIndex(key);
		MapNode<K, V> head = bucketlist.get(index);
		MapNode<K, V> temp = head;
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		MapNode<K, V> newdata = new MapNode<>(key, value);
		newdata.next = head;
		bucketlist.set(index, newdata);
		size++;
		if ((size * 1.0) / bucketsize > 0.7) {
			rehash();
		}
	}

	private void rehash() {

		ArrayList<MapNode<K, V>> temp = bucketlist;
		bucketsize = bucketsize * 2;
		bucketlist = new ArrayList<MapNode<K, V>>();
		for (int i = 0; i < bucketsize; i++) {
			bucketlist.add(null);
		}
		size = 0;
		for (MapNode<K, V> head : temp) {
			while (head != null) {
				add(head.key, head.value);
				head = head.next;
			}
		}

	}
}
