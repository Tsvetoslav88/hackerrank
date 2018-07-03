package javaquizzes;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


/**
 * https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem?h_l=playlist&slugs%5B%5D=interview&slugs%5B%5D=interview-preparation-kit&slugs%5B%5D=linked-lists
 * @author tstsvetk
 *
 * Sample Input
 * 3
 * 16
 * 13
 * 7
 * 1
 * 2
 * 
 * Sample Output
 * 16 13 1 7
 *
 *
 *The initial linked list is 16 13 7. We have to insert 1 at the position 2 which currently has 7 in it. The updated linked list will be 16 13 1 7
 */
public class SinglyLinkedListNodeSolution {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferWriter)
			throws IOException {
		while (node != null) {
			bufferWriter.write(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				bufferWriter.write(sep);
			}
		}
	}

	// Complete the insertNodeAtPosition function below.

	/*
	 * For your reference:
	 *
	 * SinglyLinkedListNode { int data; SinglyLinkedListNode next; }
	 *
	 */
	static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
		
		SinglyLinkedListNode temp = head;
		int index = 0;
		while(++index != position) {
			temp = temp.next;
		}
		
		SinglyLinkedListNode node = new SinglyLinkedListNode(data);
		node.next = temp.next;
		temp.next = node;
		
		return head;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		SinglyLinkedList llist = new SinglyLinkedList();

		int llistCount = scanner.nextInt();
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < llistCount; i++) {
			int llistItem = scanner.nextInt();
			// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			llist.insertNode(llistItem);
		}

		// printSinglyLinkedList(llist.head, " ", bufferedWriter);

		int data = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int position = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

		printSinglyLinkedList(llist_head, " ", bufferedWriter);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();

	}
}
