package java;

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

		//sum the lengths of A and B 
		System.out.println(A.length() + B.length());
		
		//write Yes if A is lexicographically larger than B or No if it is not
		System.out.println(A.compareTo(B)>0?"Yes":"No");
		
		//capitalize the first letter in both A and B and print them on a single line, separated by a space.
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
	}
}
