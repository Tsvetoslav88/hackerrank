package daysofcode30;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-recursion/problem?h_r=email&unlock_token=dc215c82db5ce4ac3f7fe09186a77ccf21cf555b&utm_campaign=30_days_of_code_continuous&utm_medium=email&utm_source=daily_reminder
 * @author tstsvetk
 *
 */
public class Day9 {

	// Complete the factorial function below.
	static int factorial(int n) {
		//Base case
		if(n==1) {
			return 1;
			
		}else {// Recursive case
			return n * factorial(n-1);
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int result = factorial(n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
