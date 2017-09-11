package DataStructures;

public class MergeTwoSortedLinkedList {
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

}
