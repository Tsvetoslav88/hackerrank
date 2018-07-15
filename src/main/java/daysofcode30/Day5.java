package daysofcode30;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-loops/problem?h_r=email&unlock_token
 * =3f84118a675b5f4a061fffe657542ec9ee4449f6&utm_campaign=
 * 30_days_of_code_continuous&utm_medium=email&utm_source=daily_reminder
 * 
 * @author TSVETOSLAV
 *
 */
public class Day5 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}

		scanner.close();
	}
}
