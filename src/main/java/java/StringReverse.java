package java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-reverse/problem
 * 
 * @author TSVETOSLAV
 *
 */
public class StringReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		sc.close();
		String result = isPalindrome(A);
		System.out.println(result);

	}

	private static String isPalindrome(String word) {

		if (word.length() > 0 && word.length() < 50) {
			for (int i = 0; i < word.length() / 2; i++) {
				if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
					return "No";
				}
			}

		}
		return "Yes";
	}

}
