package datastructures;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=trees
 * 
 * Input Format
 * 	The first line contains an integer , the number of nodes in the tree. 
 * 	Next line contains  space separated integer where th integer denotes node[i].data.
 * @author tstsvetk
 *
 */

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}


public class HeightOfABinaryTree {
	
	public static int height(Node root) {
      	if(root == null) {
      		return -1;
      	}else {
      		return 1 + Math.max(height(root.left), height(root.right));
      	}
    }
	
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}
