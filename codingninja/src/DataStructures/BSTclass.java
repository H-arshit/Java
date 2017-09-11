package DataStructures;

class BSTNode {
	int data;
	BSTNode left, right;

	public BSTNode(int data) {
		this.data = data;
	}
}

public class BSTclass {

	private BSTNode root;
	private int size;

	public BSTclass() {
		root = null;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void insert(int data) {
		BSTNode temp = new BSTNode(data);
		if (root == null) {
			root = temp;
			return;
		}
		BSTNode ite = root;
		BSTNode pos = null;

		while (ite != null) {
			if (ite.data < data) {
				pos = ite;
				ite = ite.right;
			} else {
				pos = ite;
				ite = ite.left;
			}

		}
		if (pos.data < data) {
			pos.right = temp;

		} else {
			pos.left = temp;
		}

	}

	public void printlevelwise() {
		BSTNode temp = root;
		if (temp == null) {
			return;
		}
		QueueUsingLinkedList<BSTNode> que = new QueueUsingLinkedList<>();
		que.enqueue(temp);
		while (!que.isEmpty()) {
			BSTNode parent;
			try {
				parent = que.dequeue();
			} catch (QueueEmptyException e) {
				return;
			}
			System.out.print(parent.data + " : ");
			if (parent.left != null) {

				que.enqueue(parent.left);
				System.out.print(parent.left.data + " , ");
			}
			if (parent.right != null) {
				que.enqueue(parent.right);
				System.out.print(parent.right.data + " , ");
			}
			System.out.println();
		}

	}

	public boolean search(int data) {
		BSTNode temp = root;
		while (temp != null) {
			if (temp.data == data) {
				return true;
			}
			if (temp.data < data) {
				temp = temp.right;
			} else {
				temp = temp.left;
			}
		}
		return false;
	}

	private void remove(int data, BSTNode parent, BSTNode temp) {
		if (temp.left == null && temp.right == null) {
			if (parent != null) {
				if (parent.left == temp) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			} else {
				root = null;
			}
		} else if (temp.right == null) {
			if (parent != null) {
				if (parent.left == temp) {
					parent.left = temp.left;
				} else {
					parent.right = temp.left;
				}
			} else {
				root = temp.left;
			}
		} else if (temp.left == null) {
			if (parent != null) {
				if (parent.left == temp) {
					parent.left = temp.right;
				} else {
					parent.right = temp.right;
				}
			} else {
				root = temp.right;
			}
		} else {
			BSTNode min = getmin(temp.right);
			if (parent != null) {
				if (parent.left == temp) {
					parent.left = min;
					min.left = temp.left;
					min.right = temp.right;
				} else {
					parent.right = min;
					min.left = temp.left;
					min.right = temp.right;
				}
			} else {
				root = min;
				min.left = temp.left;
			}
		}
	}

	private BSTNode getmin(BSTNode temp) {
		BSTNode parent = temp;
		while (temp.left != null) {
			parent = temp;
			temp = temp.left;
		}
		parent.left = null;
		return temp;
	}

	public void delete(int data) {
		BSTNode temp = root, parent = null;
		while (temp != null) {
			if (temp.data == data) {
				remove(data, parent, temp);
				return;
			} else if (temp.data < data) {
				parent = temp;
				temp = temp.right;
			} else {
				parent = temp;
				temp = temp.left;
			}
		}

	}

	public static void main(String[] args) {
		BSTclass bst = new BSTclass();
		bst.insert(10);
		bst.insert(4);
		bst.insert(11);
		bst.insert(12);
		bst.insert(15);
		bst.insert(1);
		bst.insert(5);
		bst.insert(6);
		bst.insert(7);
		bst.insert(19);
		bst.printlevelwise();

	}
}
