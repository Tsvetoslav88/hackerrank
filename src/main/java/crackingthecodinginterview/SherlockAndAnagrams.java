package crackingthecodinginterview;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem
 * @author tstsvetk
 * 
 * Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string. Given a string, find the number of pairs of substrings of the string which are anagrams of each other.
 * For example s=mom, the list of all anagrammatic pairs is [m,m],[m.o] at positions [[0],[2]],[[0],[1]],[[1],[2]] respectively.
 * 
 * Sample Input 0
 * 1
 * abba
 * 
 * Sample Output 0
 * 4
 *
 */
public class SherlockAndAnagrams {

	static int sherlockAndAnagrams(String s) {
		List<String> subtrings = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				subtrings.add(s.substring(i, j + 1));
			}
		}

		int anms = 0;
		for (int i = 0; i < subtrings.size(); i++) {
			for (int j = 0; j < subtrings.size(); j++) {
				if (i != j && checkAnagram(subtrings.get(i), subtrings.get(j))) {
					anms++;
				}
			}
		}
		return anms / 2;
	}

	public static boolean checkAnagram(String a, String b) {
		if (a.length() != b.length())
			return false;

		int[] ar = new int[26];
		for (int i = 0; i < a.length(); i++) {
			ar[a.charAt(i) - 'a']++;
			ar[b.charAt(i) - 'a']--;
		}

		for (int i = 0; i < 26; i++) {
			if (ar[i] != 0) {
				return false;
			}
		}

		return true;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = sherlockAndAnagrams(s);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
