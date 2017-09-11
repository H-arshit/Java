package DataStructures;

import java.util.Scanner;

public class NodeUse {
	public static Node makenode() {
		Node head = null;
		Scanner s = new Scanner(System.in);
		int nextnode = s.nextInt();
		while (nextnode != -1) {
			Node node = new Node(nextnode);
			if (head == null) {
				head = node;
			} else {
				Node tail = head;
				while (tail.next != null) {
					tail = tail.next;
				}
				tail.next = node;
			}
			nextnode = s.nextInt();
		}
		return head;
	}

	public static void print(Node head) {
		while (head != null) {
			System.out.print(head.data + "-->");
			head = head.next;
		}
		System.out.println();
	}

	public static int elementati(int i, Node head) {
		while (i > 1) {
			head = head.next;
			if (head == null) {
				return -1;
			}
			i--;
		}
		return head.data;
	}

	public static int lengthoflist(Node head) {
		if (head == null) {
			return 0;
		}
		int i = lengthoflist(head.next);
		i++;
		return i;
	}

	public static Node insertAtI(Node head, int position, int element) {
		if (position == 0) {
			Node node = new Node(element);
			node.next = head;
			head = node;

		} else {
			Node inspos = head;
			while (position != 1) {
				if (inspos == null) {
					return head;
				}
				inspos = inspos.next;
				position--;
			}
			Node node = new Node(element);
			node.next = inspos.next;
			inspos.next = node;

		}

		return head;
	}

	public static Node insertusingRec(Node head, int position, int element) {
		if (head == null && position > 0) {
			return head;
		}
		if (position == 0) {
			Node newnode = new Node(element);
			newnode.next = head;
			return newnode;
		}
		Node prevnode = insertusingRec(head.next, position - 1, element);
		head.next = prevnode;
		return head;
	}

	public static Node deleteIterarively(Node head, int position) {
		if (position >= lengthoflist(head)) {
			return head;
		}
		if (position == 0) {
			System.out.println("value deleted is " + head.data);
			return head.next;
		} else {
			Node del = head;
			while (position != 1) {
				del = del.next;
				position--;
			}
			System.out.println("value deleted is " + del.next.data);
			del.next = del.next.next;
		}
		return head;
	}

	public static Node delRec(Node head, int position) {
		if (head == null && position != 0) {
			return head;
		}
		if (position == 0) {
			return head.next;
		}
		Node prev = deleteIterarively(head.next, position - 1);
		head.next = prev;
		return head;

	}

	public static Node findmiditerate(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast.next != null) {

			if (fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			} else {
				fast = fast.next;

			}
		}
		return slow;

	}

	public static int findelementposititon(Node head, int element) {
		if (head == null) {
			return -1;
		}
		if (head.data == element) {
			return 0;
		}
		int i = findelementposititon(head.next, element);
		if (i == -1) {
			return -1;
		}
		return 1 + i;
	}

	public static Node merge(Node head1, Node head2) {
		if (head1 == null || head2 == null) {
			if (head1 == null) {
				return head2;
			}
			return head1;
		}
		Node outputtail = null, tail1 = head1, tail2 = head2;
		Node finalhead = null;

		while (tail1 != null || tail2 != null) {
			if (tail1 == null) {
				outputtail.next = tail2;
				outputtail = tail2;
				tail2 = tail2.next;

			} else if (tail2 == null) {
				outputtail.next = tail1;
				outputtail = tail1;
				tail1 = tail1.next;

			} else if (tail1.data > tail2.data) {

				if (finalhead == null) {
					finalhead = tail2;
					outputtail = tail2;
					tail2 = tail2.next;
				} else {
					outputtail.next = tail2;
					outputtail = tail2;
					tail2 = tail2.next;
				}
			} else {
				if (finalhead == null) {
					finalhead = tail1;
					outputtail = tail1;
					tail1 = tail1.next;
				} else {
					outputtail.next = tail1;
					outputtail = tail1;
					tail1 = tail1.next;
				}
			}
		}
		return finalhead;

	}

	public static Node Sort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node temp = findmiditerate(head);
		Node head2 = temp.next;
		temp.next = null;
		head = Sort(head);
		head2 = Sort(head2);
		head = merge(head, head2);
		return head;
	}

	public static Node addlinkedlisthelper(Node head1, Node head2) {
		if (lengthoflist(head1) == 0) {
			return head2;
		} else if (lengthoflist(head2) == 0) {
			return head1;
		}

		int length1 = lengthoflist(head1), length2 = lengthoflist(head2);
		Node temp = head1;
		for (int i = (length1 - length2); i != 0; i--) {
			temp = temp.next;
		}
		Node newhead = addlinkedlists(temp, head2);
		if ((length1 - length2) > 0) {
			newhead = addrestofmylist(head1, newhead, (length1 - length2));
		}
		if (newhead.data == 0) {
			newhead = newhead.next;
		}
		return newhead;
	}

	public static Node addrestofmylist(Node head1, Node newhead, int len) {
		if (len == 0) {
			return newhead;
		}
		len=len-1;
		newhead = addrestofmylist(head1.next, newhead,len);
		newhead.data = (head1.data + newhead.data);

		Node temp = new Node(((newhead.data) / 10));
		newhead.data = newhead.data % 10;
		temp.next = newhead;
		newhead = temp;
		return newhead;
	}

	public static Node addlinkedlists(Node head1, Node head2) {
		if (head1.next == null || head2.next == null) {
			Node newhead = new Node((head1.data + head2.data) % 10);
			Node newcarr = new Node(((head1.data + head2.data) / 10));
			newcarr.next = newhead;
			return newcarr;
		}
		Node temp1 = head1, temp2 = head2;
		if (temp1.next != null) {
			temp1 = temp1.next;
		}
		if (temp2.next != null) {
			temp2 = temp2.next;
		}
		Node head = addlinkedlists(temp1, temp2);
		head.data = (head1.data + head2.data + head.data);
		Node temp = new Node(head.data / 10);
		head.data = head.data % 10;
		temp.next = head;
		head = temp;
		return head;

	}

	public static void main(String[] args) {

		Node head = null, head2 = null;
		Scanner s = new Scanner(System.in);
		head = makenode();
		print(head);
		head2 = makenode();
		print(head2);
		System.out.println("Addition of the two linked list is :");
		Node sumhead = addlinkedlisthelper(head, head2);
		print(sumhead);

		// head2=makenode();
		// print(head);
		// print(head);
		// head=Sort(head);
		// print(head);
		// Node finalhead=merge(head, head2);
		// print(finalhead);
		// System.out.println(elementati(s.nextInt(), head));
		// System.out.println(lengthoflist(head));
		// head = insertAtI(head, s.nextInt(), s.nextInt());
		// print(head);
		// head = insertusingRec(head, s.nextInt(), s.nextInt());
		// print(head);
		// head = deleteIterarively(head, s.nextInt());
		// print(head);
		// head = deleteIterarively(head, s.nextInt());
		// print(head);
		// head = delRec(head, s.nextInt());
		// print(head);
		// head = delRec(head, s.nextInt());
		// print(head);
		// head = delRec(head, s.nextInt());
		// print(head);
		// if (head != null) {
		// Node mid = findmiditerate(head);
		// System.out.println(mid.data);
		// }
		// System.out.println(findelementposititon(head, s.nextInt()));

	}

}
