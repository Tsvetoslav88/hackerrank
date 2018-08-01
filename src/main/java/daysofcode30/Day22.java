package daysofcode30;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-binary-search-trees/problem
 * 
 * @author tstsvetk
 *
 */
class Node1 {
	Node1 left, right;
	int data;

	public Node1(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node1 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}

	static int height = 0;

	private static int getHeight(Node1 root) {

		if(root==null) {
			return -1;
		}
		int left = 1 + getHeight(root.left);
		int right = 1 + getHeight(root.right);
		
		return Math.max(left, right);
		
	}

	private static Node1 insert(Node1 root, int data) {

		if (root == null) {
			root = new Node1(data);
		} else {
			Node1 cur;

			if (root.data > data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
		}
		return root;
	}

}
