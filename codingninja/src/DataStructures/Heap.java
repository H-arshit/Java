package DataStructures;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> data;

	public Heap() {
		data = new ArrayList<Integer>();
		data.add(null);
	}

	public int size() {
		return data.size() - 1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int topelement() throws HeapEmptyException {
		if (size() == 0)

		{
			throw new HeapEmptyException();
		}
		return data.get(1);

	}

	public void add(int element) {
		data.add(element);
		int child = size();
		while (child != 1 && data.get(child) < data.get(child/2)) {
			int temp = data.get(child);
			data.set(child, data.get(child / 2));
			data.set(child / 2, temp);
			child = child / 2;
		}
	}

	public int remove() throws HeapEmptyException {
		if (size() == 0) {
			throw new HeapEmptyException();
		}
		int temp = data.get(data.size() - 1);
		data.set(data.size() - 1, data.get(1));
		data.set(1, temp);
		temp=data.remove(data.size() - 1);
		int parent = 1;
		int leftchild = parent * 2;
		int rightchild = leftchild + 1;

		while (leftchild <= size()) {
			int smallest = parent;
			if (data.get(leftchild) < data.get(parent)) {
				smallest = leftchild;
			}
			if (rightchild<=size() && data.get(rightchild) < data.get(smallest)) {
				smallest = rightchild;

			}
			if (smallest == parent) {
				break;
			}
			int temp1 = data.get(smallest);
			data.set(smallest, data.get(parent));
			data.set(parent, temp1);
			parent=smallest;
			leftchild = parent * 2;
			rightchild = leftchild + 1;

		}
		return temp;

	}
	public static void main(String[] args) throws HeapEmptyException {
		Heap myheap=new Heap();
		myheap.add(8);
		myheap.add(7);
		myheap.add(6);
		myheap.add(5);
		myheap.add(4);
		myheap.add(3);
		myheap.add(2);
		myheap.add(1);
		System.out.println(myheap.topelement());
		System.out.println(myheap.remove());
		System.out.println(myheap.topelement());
		System.out.println(myheap.remove());
		System.out.println(myheap.topelement());
		System.out.println(myheap.remove());
		System.out.println(myheap.topelement());
		System.out.println(myheap.remove());
		System.out.println(myheap.topelement());
		System.out.println(myheap.remove());
		System.out.println(myheap.topelement());
		System.out.println(myheap.remove());
		System.out.println(myheap.topelement());
		System.out.println(myheap.remove());
		System.out.println(myheap.topelement());
		System.out.println(myheap.remove());
		System.out.println(myheap.topelement());
		System.out.println(myheap.remove());
	}
}
