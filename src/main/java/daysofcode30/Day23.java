package daysofcode30;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 * https://www.hackerrank.com/challenges/30-binary-trees/problem
 * 
 * @author tstsvetk
 *
 */
class Node2 {
	Node2 left, right;
	int data;

	Node2(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day23 {

	

	private static void levelOrder(Node2 root) {

		// Queue for Node elements
		Queue<Node2> queueNode = new LinkedList<>();
		if (root != null) {

			// enqueue current root
			queueNode.add(root);

			// while there are nodes to process
			while (!queueNode.isEmpty()) {

				// dequeue next node
				Node2 node = queueNode.remove();
				System.out.print(node.data + " ");

				// enqueue child elements from next level in order
				if (node.left != null) {
					queueNode.add(node.left);
				}
				if (node.right != null) {
					queueNode.add(node.right);
				}

			}
		}

	}

	public static Node2 insert(Node2 root, int data) {
		if (root == null) {
			return new Node2(data);
		} else {
			Node2 cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node2 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}

}
