package daysofcode30;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-2d-arrays/problem?h_r=email&
 * unlock_token=47507bb76453f52617c88cf73b11bcc230f95cec&utm_campaign=
 * 30_days_of_code_continuous&utm_medium=email&utm_source=daily_reminder
 * 
 * @author TSVETOSLAV
 *
 */
public class Day11 {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int maxSum = -1000;
		int tempSum = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				tempSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
				        + arr[i + 2][j + 1] + arr[i + 2][j + 2];
				if (tempSum > maxSum) {
					maxSum = tempSum;
				}
			}
		}

		System.out.println(maxSum);

		scanner.close();
	}
}
