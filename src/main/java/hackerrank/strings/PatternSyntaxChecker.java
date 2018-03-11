package hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

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
