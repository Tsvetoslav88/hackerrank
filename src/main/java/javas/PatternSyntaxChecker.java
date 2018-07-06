package javas;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
* https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
*/
public class PatternSyntaxChecker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		// System.out.println(testCases);
		while (testCases > 0) {
			String pattern = in.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}
			// System.out.println(pattern);

			testCases--;
		}
	}
}
