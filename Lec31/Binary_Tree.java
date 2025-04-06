package Lec31;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree {

	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	private Scanner sc = new Scanner(System.in);

	public Binary_Tree() {
		// TODO Auto-generated constructor stub
		root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}
		return nn;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {// nn me root ka address aayega
		if (nn == null) {
			return;
		}
		String str = "<--" + nn.val + "-->";
		if (nn.left != null) {
			str = nn.left.val + str;
		} else {
			str = "." + str;
		}
		if (nn.right != null) {
			str = str + nn.right.val;
		} else {
			str = str + ".";
		}
		System.out.println(str);
		Display(nn.left);
		Display(nn.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}

		int lmax = max(nn.left);
		int rmax = max(nn.right);
		return Math.max(nn.val, Math.max(lmax, rmax));

	}

	public boolean find(int item) {

		return find(root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.val == item) {
			return true;
		}
		boolean left = find(nn.left, item);
		boolean right = find(nn.right, item);
		return left || right;

	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {
		if (node == null) {
			return 0;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;

	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}

	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		if (node == null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.val + " ");

	}

	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}

	private void INOrder(Node node) {
		if (node == null) {
			return;
		}
		INOrder(node.left);
		System.out.print(node.val + " ");
		INOrder(node.right);

	}

	public void levelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node rv = q.poll();
			System.out.print(rv.val + " ");
			if(rv.left!=null) {
				q.add(rv.left);
			}
			if(rv.right!=null) {
				q.add(rv.right);
			}
		}
		System.out.println();
	}

}













