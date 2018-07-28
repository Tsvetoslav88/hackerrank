package daysofcode30;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Day18 {

	Stack<Character> myStack;
	Queue<Character> myQueue;

	public Day18() {
		myStack = new Stack<>();
		myQueue = new LinkedList<>();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Day18 p = new Day18();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare
		// them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}

	// add element to the tail of Queue
	private void enqueueCharacter(char c) {
		myQueue.add(c);
	}

	// add element at the bottom of Stack
	private void pushCharacter(char c) {
		myStack.push(c);
	}

	// get element from the head of Queue
	private Object dequeueCharacter() {
		return myQueue.poll();
	}

	// get element from the top of Stack
	private Object popCharacter() {
		return myStack.pop();
	}

}
