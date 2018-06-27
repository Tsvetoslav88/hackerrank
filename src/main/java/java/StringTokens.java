package java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-tokens/problem
 * 
 * @author TSVETOSLAV
 *
 */
public class StringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "He is a very very good boy, isn't he?";//
		// scan.nextLine();
		// String s = "";

		if (s.length() > 400000) {
			return;
		} else if (s == null || s.equals("") || s.trim().equals("")) {
			System.out.println("0");
		} else {
			String[] splitStr = s.trim().split("[ !,?._'@]+");
			System.out.println(splitStr.length);
			for (String str : splitStr) {
				System.out.println(str);
			}
		}

		// Write your code here.
		// scan.close();
	}
}
