package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import org.omg.PortableInterceptor.INACTIVE;

class Fourlets<T, U, V, W> {

	T min;
	U max;
	V bestbst;
	W height;

	public Fourlets(T min, U max, V bestbst, W height) {
		this.min = min;
		this.max = max;
		this.bestbst = bestbst;
		this.height = height;
	}

}

class Pair<T, V> {
	T first;
	V second;

	public Pair(T first, V second) {
		this.first = first;
		this.second = second;
	}
}

class Triplet<U, V, W> {
	U first;
	V max;
	W min;

	public Triplet(U first, V second, W third) {
		this.first = first;
		this.max = second;
		this.min = third;
	}
}

public class BinaryTreeUse {
	// 1 2 3 4 5 -1 -1 -1 6 7 -1 8 -1 -1 9 -1 10 11 -1 -1 -1 -1 12 -1 -1
	// 1 2 3 4 5 -1 -1 -1 -1 6 7 -1 -1 8 -1 -1 -1
	// 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
	// 4 2 8 1 10 6 7 -1 -1 -1 -1 -1 -1 -1 -1
	// 4 2 8 1 -1 6 7 -1 -1 -1 -1 -1 -1
	public static TreeNode<Integer> takeTreeInputLevelWise() {
		System.out.println("Enter root data");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}

		TreeNode<Integer> root = new TreeNode<>(rootData);
		QueueUsingLinkedList<TreeNode<Integer>> queue = new QueueUsingLinkedList<>();
		queue.enqueue(root);
		while (!queue.isEmpty()) {
			TreeNode<Integer> parent;
			try {
				parent = queue.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter left child of " + parent.data);
			int leftData = s.nextInt();
			if (leftData != -1) {
				TreeNode<Integer> leftChild = new TreeNode<Integer>(leftData);
				queue.enqueue(leftChild);
				parent.left = leftChild;
			}

			System.out.println("Enter right child of " + parent.data);
			int rightData = s.nextInt();
			if (rightData != -1) {
				TreeNode<Integer> rightChild = new TreeNode<Integer>(rightData);
				queue.enqueue(rightChild);
				parent.right = rightChild;
			}
		}
		return root;
	}

	// 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1
	public static TreeNode<Integer> takeTreeInput(Scanner s) {
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}

		TreeNode<Integer> root = new TreeNode<>(rootData);
		root.left = takeTreeInput(s);
		root.right = takeTreeInput(s);
		return root;
	}

	public static void print(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print(root.left.data + ",");
		}
		if (root.right != null) {
			System.out.print(root.right.data + ",");
		}
		System.out.println();

		print(root.left);
		print(root.right);
	}

	public static int sum(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		return sum(root.left) + sum(root.right) + root.data;
	}

	public static int numberNodes(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		return numberNodes(root.left) + numberNodes(root.right) + 1;
	}

	public static int returnmax(TreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int m1 = returnmax(root.left);
		int m2 = returnmax(root.right);
		int max = (m1 > m2) ? m1 : m2;

		return (max > root.data) ? max : root.data;
	}

	public static boolean searchanelement(TreeNode<Integer> root, int element) {
		if (root == null) {
			return false;
		}
		if (root.data == element) {
			return true;
		}

		boolean b1 = searchanelement(root.left, element), b2 = searchanelement(
				root.right, element);
		if (b1 == true || b2 == true) {
			return true;
		} else {
			return false;
		}

	}

	public static int heightoftree(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int lefttree = heightoftree(root.left), righttree = heightoftree(root.right);
		return (lefttree > righttree) ? (lefttree + 1) : (righttree + 1);

	}

	public static int noofleaf(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return noofleaf(root.left) + noofleaf(root.right);

	}

	public static void printlevelwise(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		QueueUsingLinkedList<TreeNode<Integer>> que = new QueueUsingLinkedList<>();
		que.enqueue(root);
		while (!que.isEmpty()) {
			TreeNode<Integer> parent;
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

	public static void printkthlevel(TreeNode<Integer> root, int k) {
		if (root == null || k < 0) {
			return;
		}

		if (k == 0) {
			System.out.println(root.data);
			return;
		}
		printkthlevel(root.left, k - 1);
		printkthlevel(root.right, k - 1);

	}

	public static int maxsumnodeinclchild(TreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		QueueUsingLinkedList<TreeNode<Integer>> que = new QueueUsingLinkedList<TreeNode<Integer>>();
		que.enqueue(root);
		int sum = 0, ele = 0, max = Integer.MIN_VALUE;
		while (!que.isEmpty()) {
			TreeNode<Integer> parent;
			try {
				parent = que.dequeue();
			} catch (QueueEmptyException e) {
				return Integer.MIN_VALUE;
			}

			if (parent.left != null) {
				que.enqueue(parent.left);
				sum = sum + parent.left.data;
			}
			if (parent.right != null) {
				que.enqueue(parent.right);
				sum = sum + parent.right.data;
			}
			sum = sum + parent.data;
			if (sum > max) {
				max = sum;
				ele = parent.data;
			}
			sum = 0;
		}
		return ele;
	}

	public static boolean isbalanced(TreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		if (!isbalanced(root.left)) {
			return false;
		}
		if (!isbalanced(root.right)) {
			return false;
		}
		int lfttre = heightoftree(root.left);
		int rgttre = heightoftree(root.right);
		if (lfttre == rgttre || (lfttre - rgttre == 1)
				|| (lfttre - rgttre == -1)) {
			return true;
		}
		return false;
	}

	public static boolean isidentical(TreeNode<Integer> root1,
			TreeNode<Integer> root2) {
		if ((root1 == null && root2 != null)
				|| (root2 == null && root1 != null)) {
			return false;
		}
		if (root1 == null && root2 == null) {
			return true;
		}
		if (!(root1.data == root2.data)) {
			return false;
		}

		return (isidentical(root1.left, root2.left) && isidentical(root1.right,
				root2.right));

	}

	public static TreeNode<Integer> getTree(int preorder[], int inorder[],
			int srtpre, int endpre, int srtinor, int endinorder) {
		if (srtpre > endpre) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<Integer>(preorder[srtpre]);
		int i, j = 0;
		for (i = srtinor; i <= endinorder; i++) {
			j++;
			if (preorder[srtpre] == inorder[i]) {
				break;
			}
		}

		root.left = getTree(preorder, inorder, srtpre + 1, srtpre + j - 1,
				srtinor, i - 1);
		root.right = getTree(preorder, inorder, srtpre + j, endpre, i + 1,
				endinorder);
		return root;

	}

	public static int diameter(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftdia = diameter(root.left);
		int rightdia = diameter(root.right);
		int leftheight = heightoftree(root.left);
		int rightheight = heightoftree(root.right);
		return Math.max(leftheight + rightheight, Math.max(leftdia, rightdia));
	}

	public static Pair<Integer, Integer> DiaAndHeight(TreeNode<Integer> root) {
		if (root == null) {
			Pair<Integer, Integer> temp = new Pair<>(0, 0);
			return temp;
		}

		Pair<Integer, Integer> left = DiaAndHeight(root.left);

		Pair<Integer, Integer> right = DiaAndHeight(root.right);
		int dia = left.first + right.first;

		Pair<Integer, Integer> newroot = new Pair<>((Math.max(left.first,
				right.first) + 1), Math.max(dia,
				Math.max(left.second, right.second)));
		return newroot;
	}

	public static int optimizeddiameter(TreeNode<Integer> root) {
		Pair<Integer, Integer> result = DiaAndHeight(root);
		return result.second;
	}

	public static int isbalancedhelper(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftheight = isbalancedhelper(root.left);
		if (leftheight == -1) {
			return -1;
		}
		int rightheight = isbalancedhelper(root.right);
		if (rightheight == -1) {
			return -1;
		}
		if (leftheight - rightheight == 0 || leftheight - rightheight == 1
				|| leftheight - rightheight == -1) {
			return (leftheight > rightheight) ? (leftheight + 1)
					: (rightheight + 1);

		}

		return -1;

	}

	public static boolean checkBalancedoptimized(TreeNode<Integer> root) {
		int i = isbalancedhelper(root);
		if (i == -1) {
			return false;
		}
		return true;
	}

	public static ArrayList<TreeNode<Integer>> printallancestors(
			TreeNode<Integer> root, int num) {
		if (root == null) {
			return null;
		}
		if (root.data == num) {
			return new ArrayList<TreeNode<Integer>>();
		}

		ArrayList<TreeNode<Integer>> res = printallancestors(root.left, num);
		if (res != null) {
			res.add(root);
			return res;
		}
		res = printallancestors(root.right, num);
		if (res != null) {
			res.add(root);
			return res;
		}
		return res;
	}

	public static int lcaBinaryTree(TreeNode<Integer> root, int a, int b) {
		if (root == null) {
			return -1;
		}
		if (root.data == a || root.data == b) {
			return root.data;
		}
		int temp1 = lcaBinaryTree(root.left, a, b);
		int temp2 = lcaBinaryTree(root.right, a, b);
		if (temp1 == temp2) {
			return temp1;
		}
		if (temp1 == -1) {
			return temp2;
		} else if (temp2 == -1) {
			return temp1;
		}
		return root.data;

	}

	public static Triplet<Boolean, Integer, Integer> helperbst(
			TreeNode<Integer> root) {
		if (root == null) {
			return new Triplet(true, Integer.MIN_VALUE, Integer.MAX_VALUE);
		}

		Triplet<Boolean, Integer, Integer> left = helperbst(root.left), right = helperbst(root.right);
		int max = Math.max(Math.max(left.max, right.max), root.data);
		int min = Math.min(Math.min(right.min, left.min), root.data);
		boolean isbst = false;
		if (left.first == true && right.first == true && left.max < root.data
				&& right.min > root.data) {
			isbst = true;
		}
		return new Triplet(isbst, max, min);

	}

	public static boolean checkifbst(TreeNode<Integer> root) {

		if (root == null) {
			return true;
		}
		return helperbst(root).first;
	}

	public static void inorderiteratively(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		Stack<TreeNode<Integer>> stack=new Stack<TreeNode<Integer>>();
		TreeNode<Integer> temp=root;
		while(temp!=null)
		{
			stack.push(temp);
			temp=temp.left;
		}
		ArrayList<Integer> inorder=new ArrayList<Integer>();
		while(!stack.isEmpty())
		{
			temp=stack.pop();
			inorder.add(temp.data);
			if(temp.right!=null)
			{
				temp=temp.right;
				while(temp!=null)
				{
					stack.push(temp);
					temp=temp.left;
				}
				
			}
		}
		for(int i=0;i<inorder.size();i++)
		{
			System.out.print(inorder.get(i)+" ");
		}
	}
	
	public static boolean helpancestor(TreeNode<Integer> root, int num) {
		if (root == null) {
			return false;
		}
		if (root.data == num) {
			return true;
		}
		if (helpancestor(root.left, num)) {
			System.out.println(root.data);
			return true;
		}
		if (helpancestor(root.right, num)) {
			System.out.println(root.data);
			return true;

		}
		return false;
	}

	public static void printancestors(TreeNode<Integer> root, int num) {
		helpancestor(root, num);
	}

	public static GenericNode<Integer> BSTtoSortedLL(TreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		GenericNode<Integer> head = BSTtoSortedLL(root.left);
		if (head == null) {
			head = new GenericNode<Integer>(root.data);
			head.next = BSTtoSortedLL(root.right);
			return head;

		}
		GenericNode<Integer> md = new GenericNode<Integer>(root.data);
		GenericNode<Integer> temp = head;
		while (temp != null && temp.next != null) {
			temp = temp.next;
		}
		temp.next = md;
		md.next = BSTtoSortedLL(root.right);
		return head;

	}

	public static TreeNode<Integer> LCAinBST(TreeNode<Integer> root, int a,
			int b) {
		if (root == null) {
			return null;
		}
		if (a == root.data || b == root.data) {
			return root;
		}
		if (a < root.data && b >= root.data || b < root.data && a >= root.data) {
			return root;
		}
		if (a < root.data && b <= root.data) {
			return LCAinBST(root.left, a, b);
		} else {
			return LCAinBST(root.right, a, b);
		}

	}

	public static TreeNode<Integer> buildbst(int arr[], int start, int end) {
		if (start > end) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<Integer>(arr[(start + end) / 2]);
		root.left = buildbst(arr, start, ((start + end) / 2) - 1);
		root.right = buildbst(arr, ((start + end) / 2) + 1, end);
		return root;
	}

	public static Fourlets<Integer, Integer, TreeNode<Integer>, Integer> largestBSThelper(
			TreeNode<Integer> root) {
		if (root == null) {
			return new Fourlets<Integer, Integer, TreeNode<Integer>, Integer>(
					Integer.MAX_VALUE, Integer.MIN_VALUE, null, 0);
		}
		Fourlets<Integer, Integer, TreeNode<Integer>, Integer> left = largestBSThelper(root.left), right = largestBSThelper(root.right);
		int min = Math.min(Math.min(left.min, right.min), root.data);
		int max = Math.max(Math.max(left.max, right.max), root.data);
		int height = Math.max(left.height, right.height);
		TreeNode<Integer> bestbst = (left.height > right.height) ? left.bestbst
				: right.bestbst;
		if (root.left == left.bestbst && root.right == right.bestbst
				&& root.data > left.max && root.data <= right.min) {
			height = height + 1;
			bestbst = root;
			return new Fourlets<Integer, Integer, TreeNode<Integer>, Integer>(
					min, max, bestbst, height);
		}
		if (left.height > right.height) {
			return left;
		}
		return right;

	}

	public static TreeNode<Integer> findlargestBST(TreeNode<Integer> root) {

		return largestBSThelper(root).bestbst;
	}

	public static int MaxSumWithoutChildren(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int sum1 = 0;
		if (root.left != null) {
			sum1 += MaxSumWithoutChildren(root.left.left)
					+ MaxSumWithoutChildren(root.left.right);
		}
		if (root.right != null) {
			sum1 += MaxSumWithoutChildren(root.right.right)
					+ MaxSumWithoutChildren(root.right.left);
		}
		sum1 += root.data;
		int sum2 = 0;
		sum2 = MaxSumWithoutChildren(root.left)
				+ MaxSumWithoutChildren(root.right);
		return Math.max(sum1, sum2);
	}

	public static void leftview(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		ArrayList<TreeNode<Integer>> que = new ArrayList<TreeNode<Integer>>();
		que.add(root);
		while (!que.isEmpty()) {
			TreeNode<Integer> parent;
			int i = que.size();
			parent = que.get(0);
			System.out.println(parent.data);
			while (i != 0) {
				i--;

				que.remove(0);

				if (parent.left != null) {

					que.add(parent.left);
				}
				if (parent.right != null) {
					que.add(parent.right);

				}
			}
		}
	}

	public static Pair<Integer, Integer> optimizedsumeithoutparentandchild(
			TreeNode<Integer> root) {
		if (root == null) {
			return new Pair(0, 0);
		}
		Pair<Integer, Integer> outputleft = optimizedsumeithoutparentandchild(root.left);
		Pair<Integer, Integer> outputright = optimizedsumeithoutparentandchild(root.right);
		return new Pair(Math.max(outputleft.first, outputleft.second)
				+ Math.max(outputright.first, outputright.second),
				outputleft.first + outputright.first + root.data);
	}
		
	public static void main(String[] args) {

		// TreeNode<Integer> root1 = takeTreeInputLevelWise();
		// Pair<TreeNode<Integer>,TreeNode<Integer>>
		// res=BSTtoSortedLLwithoutnewnode(root1);
		// TreeNode<Integer> head=res.first;
		// while(head!=null)
		// {
		// System.out.print(head.data+" ");
		// head=head.left;
		// }

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19, 20, 21 };

		TreeNode<Integer> bstfromarray = buildbst(arr, 0, arr.length - 1);
		inorderiteratively(bstfromarray);
		// System.out.println(LCAinBST(bstfromarray, 7, 8).data);
		// printlevelwise(bstfromarray);
		// GenericNode<Integer> head = BSTtoSortedLL(bstfromarray);
		// while (head != null) {
		// System.out.print(head.data + "-->");
		// head = head.next;
		// }
		// Pair<Integer, Integer> output =
		// optimizedsumeithoutparentandchild(bstfromarray);
		// System.out.println(Math.max(output.first, output.second));

		// TreeNode<Integer> bestbst = findlargestBST(root1);
		// printlevelwise(bestbst);
		// printancestors(root1,12);
		// System.out.println(checkifbst(root1));

		// System.out.println(findlowestancestor(root1, 4, 5).data);
		// ArrayList<TreeNode<Integer>> result=printallancestors(root1, 12);
		// for(int i=0;i<result.size();i++)
		// {
		// System.out.println(result.get(i).data);
		// }

		// TreeNode<Integer> root2 = takeTreeInputLevelWise();
		// System.out.println(isidentical(root1, root2));
		// System.out.println(isbalanced(root));
		// System.out.println(maxsumnodeinclchild(root));
		// printkthlevel(root, 1);
		// printlevelwise(root);
		// print(root);
		// System.out.println(returnmax(root));
		// System.out.println(searchanelement(root, 8));
		// System.out.println(heightoftree(root));
		// // System.out.println(noofleaf(root));
		//
		// int preorder[] = { 1, 2, 4, 5, 3, 6, 7 };
		// int inorder[] = { 4, 2, 5, 1, 6, 3, 7 };
		// TreeNode<Integer> root = getTree(preorder, inorder, 0,
		// preorder.length - 1, 0, inorder.length - 1);
		// printlevelwise(root);

	}

}
