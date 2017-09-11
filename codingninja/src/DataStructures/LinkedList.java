package DataStructures;

public class LinkedList<T> {
	private GenericNode<T> head;
	private GenericNode<T> tail;
	private int length;

	public LinkedList() {
		head = null;
		tail = null;
		length = 0;
	}

	public int size() {
		return length;
	}

	public void print() {
		GenericNode<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data + "--->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	public void reverse() {
		if (size() <= 1) {
			return;
		}
		GenericNode<T> current = head;
		GenericNode<T> prevnode = null;
		GenericNode<T> temp = null;

		while (current != null) {
			temp = current.next;
			current.next = prevnode;
			prevnode = current;
			current = temp;
		}
		tail = head;
		head = prevnode;
	}

	public void remove(int i) {
		if (i >= size() || i < 0) {
			System.out.println("No such position found");
			return;
		}
		if (i == 0) {
			removeFirst();
			return;
		}
		if (i == size() - 1) {
			removeLast();
			return;
		}
		GenericNode<T> temp = head;
		while (i != 1) {
			temp = temp.next;
			i--;
		}
		temp.next = temp.next.next;

		length--;
	}

	public void removeFirst() {

		if (head == null) {
			System.out.println("empty list");
			return;
		}
		if (tail == head) {
			head = tail = null;
			return;
		}
		head = head.next;
		length--;
	}

	public void removeLast() {
		if (tail == null) {
			System.out.println("empty list");
			return;
		}
		if (tail == head) {
			head = tail = null;
			return;
		}

		GenericNode<T> temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}
		tail = temp;
		tail.next = null;
		length--;
	}

	public void insert(int i, T element) {
		if (i < 0 || i >= size()) {
			System.out.println("No such position exists");
			return;
		}
		if (i == 0) {
			addToFront(element);
			return;
		}
		if (i == size() - 1) {
			addToBack(element);
			return;
		}
		GenericNode<T> temp = new GenericNode<T>(element);
		GenericNode<T> temp2 = head;
		while (i != 1) {
			temp2 = temp2.next;
			i--;
		}
		temp2.next = temp.next;
		temp.next = temp2;

		length++;
	}

	public void addToFront(T element) {

		GenericNode<T> temp = new GenericNode<T>(element);
		temp.next = head;
		head = temp;
		if (tail == null)
			tail = head;
		length++;
	}

	public void addToBack(T element) {

		GenericNode<T> temp = new GenericNode<T>(element);
		tail.next = temp;
		tail = temp;
		if (head == null) {
			head = tail;
		}
		length++;
	}

}
