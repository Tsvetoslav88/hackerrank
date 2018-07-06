package javas;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-end-of-file/problem
 * @author cpt2tts
 *
 */
public class EOF {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;
        while (scanner.hasNext()) {
			System.out.println(lineNumber + " " + scanner.nextLine());
			lineNumber++;
		}
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
