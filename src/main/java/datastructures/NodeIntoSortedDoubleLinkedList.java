package datastructures;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists
 * 
 * @author tsvetoslav
 *
 */
public class NodeIntoSortedDoubleLinkedList {

	static class DoublyLinkedListNode {
		public int data;
		public DoublyLinkedListNode next;
		public DoublyLinkedListNode prev;

		public DoublyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
			this.prev = null;
		}
	}

	static class DoublyLinkedList {
		public DoublyLinkedListNode head;
		public DoublyLinkedListNode tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
				node.prev = this.tail;
			}

			this.tail = node;
		}
	}

	// Complete the sortedInsert function below.

	/*
	 * For your reference:
	 *
	 * DoublyLinkedListNode { int data; DoublyLinkedListNode next;
	 * DoublyLinkedListNode prev; }
	 *
	 */
	static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
		
		DoublyLinkedListNode node = new DoublyLinkedListNode(data);
		
		if(head == null) {
			return node;
		}else if(data <= head.data) {
			node.next = head;
			head.prev = node;
			return node;
		}else {
			DoublyLinkedListNode rest = sortedInsert(head.next, data);
			head.next = rest;
			rest.prev = head;
			return head;
		}
		
	}

	public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
			throws IOException {
		while (node != null) {
			bufferedWriter.write(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				bufferedWriter.write(sep);
			}
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			DoublyLinkedList llist = new DoublyLinkedList();

			int llistCount = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < llistCount; i++) {
				int llistItem = scanner.nextInt();
//                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

				llist.insertNode(llistItem);
			}

			int data = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			DoublyLinkedListNode llist1 = sortedInsert(llist.head, data);

//            printDoublyLinkedList(llist1, " ", bufferedWriter);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
