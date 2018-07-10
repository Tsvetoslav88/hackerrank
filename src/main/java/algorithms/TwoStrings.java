package algorithms;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


/**
 * https://www.hackerrank.com/challenges/two-strings/problem?h_l=playlist&slugs%5B%5D=interview&slugs%5B%5D=interview-preparation-kit&slugs%5B%5D=dictionaries-hashmaps
 * 
 * @author tstsvetk
 *
 * Given two strings, determine if they share a common substring. A substring may be as small as one character.
 * For example, the words "a", "and", "art" share the common substring a. The words "be" and "cat" do not share a substring.
 * 
 * Sample Input
 * 2
 * hello
 * world
 * hi
 * world
 * 
 * Sample Output
 * YES
 * NO
 *
 */
public class TwoStrings {

	private static String twoStrings(String s1, String s2) {
		
		String setOfCharacters = "abcdefghijklmnopqrstuvwxyz"; 
		
		for(char c : setOfCharacters.toCharArray())

		{
		        if(s1.indexOf(c) > -1 && s2.indexOf(c) > -1)
		        return "YES";
		    }
		
//		char[] s1Char = s1.toCharArray();
//		for(int i=0; i<s1Char.length; i++) {
//			if(s2.indexOf(s1Char[i])>=0) {
//				return "YES";
//			}
//		}
		return "NO";
	}
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
        	String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

	

}
