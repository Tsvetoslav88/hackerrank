package hackerrank.strings;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * https://www.hackerrank.com/challenges/java-string-compare/forum
 * 
 * @author TSVETOSLAV
 *
 */
public class SubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		SortedSet<String> sets = new TreeSet<String>();

		for (int j = 0; j <= s.length(); j++) {
			if (j + k <= s.length()) {
				sets.add(s.substring(j, j + k));
			}
		}

		smallest = sets.first();
		largest = sets.last();

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
