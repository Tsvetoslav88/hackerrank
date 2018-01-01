package hackerrank.strings;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-strings-introduction/problem
 * 
 * @author TSVETOSLAV
 *
 */

public class StringIntr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		int aLenght = A.length();
		int bLenght = B.length();

		System.out.println(aLenght + bLenght);
	}
}
