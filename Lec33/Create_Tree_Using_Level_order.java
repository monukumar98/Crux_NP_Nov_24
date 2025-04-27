package Lec33;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Lec33.Create_Tree_Using_Level_order.Node;

public class Create_Tree_Using_Level_order {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Create_Tree_Using_Level_order() {
		// TODO Auto-generated constructor stub
		createTree();
	}

	private void createTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		root = nn;
		Queue<Node> q = new LinkedList<>();
		q.add(nn);
		while (!q.isEmpty()) {
			Node rn = q.poll();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node n = new Node();
				n.val = c1;
				rn.left = n;
				q.add(n);

			}
			if (c2 != -1) {
				Node n = new Node();
				n.val = c2;
				rn.right = n;
				q.add(n);
			}
		}

	}
}
