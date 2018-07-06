package crackingthecodinginterview;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem?h_l=playlist&slugs%5B%5D=interview&slugs%5B%5D=interview-preparation-kit&slugs%5B%5D=stacks-queues
 * 
 * @author tstsvetk
 *
 *         In this challenge, you must first implement a queue using two stacks.
 *         Then process q queries, where each query is one of the following 3
 *         types: 1: Enqueue element into the end of the queue. 2: Dequeue the
 *         element at the front of the queue. 3: Print the element at the front
 *         of the queue.
 * 
 *         Sample Input 10 1 42 2 1 14 3 1 28 3 1 60 1 78 2 2
 * 
 *         Sample Output 14 14
 * 
 *
 */
public class QueuesSolution {

	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { // enqueue
				queue.enqueue(scan.nextInt());
			}else if (operation == 2) { // dequeue
				queue.dequeue();
			}else if (operation == 3) { // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}

}

class MyQueue<Т> {

	@SuppressWarnings("hiding")
	private class Node<Т> {
		private Т data;
		Node<?> next;
		
		public Node(Т data) {
			super();
			this.data = data;
		}
		
	}

	private Node<?> head;
	private Node<?> tail;
	
	
	public <T> void enqueue(T data) {
		Node<T> node = new Node<T>(data);
		if(this.tail != null) {
			this.tail.next = node;
		}
		
		this.tail = node;
		
		if(this.head == null) {
			this.head = node;
		}
	}


	public void dequeue() {
		this.head = this.head.next;
		if(head == null) {
			this.tail = null;
		}
	}


	@SuppressWarnings("unchecked")
	public Т peek() {
		return (Т) this.head.data;
	}

}