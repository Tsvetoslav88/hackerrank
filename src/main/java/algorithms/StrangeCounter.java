package algorithms;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/strange-code/problem
 * 
 * @author tstsvetk
 *
 */
public class StrangeCounter {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		long t = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = strangeCounter(t);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

	private static long strangeCounter(long t) {

		long rem = 3;
		while (t > rem) {
			t = t - rem;
			rem *= 2;
		}

		return rem - t + 1;
	}
}
