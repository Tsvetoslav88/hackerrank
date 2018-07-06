package javas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-anagrams/problem
 * 
 * @author TSVETOSLAV
 *
 */
public class Anagrams {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String b = input.next();
		input.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not anagrams");

	}

	static boolean isAnagram(String a, String b) {

		// test for invalid input
		if (a == null || b == null || a.equals("") || b.equals(""))
			throw new IllegalArgumentException();

		// check for the constraints
		if (a.length() <= 1 && b.length() <= 1 && a.length() > 50 && b.length() > 50) {
			return false;
		}

		// check length
		if (a.length() != b.length()) {
			return false;
		}

		a = a.toLowerCase();
		b = b.toLowerCase();

		char[] charB = b.toCharArray();
		// populate a map with letters and frequencies of String b
		Map<Character, Integer> map = new HashMap<>();

		for (char ch : charB) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		// test each letter in String a against data in the map
		// return if letter is absent in the map or its frequency is 0
		// otherwise decrease the frequency by 1

		for (int k = 0; k < a.length(); k++) {
			char letter = a.charAt(k);

			if (!map.containsKey(letter))
				return false;

			Integer frequency = map.get(letter);

			if (frequency == 0)
				return false;
			else
				map.put(letter, --frequency);
		}
		// if the code got that far it is an anagram
		return true;
	}

}
