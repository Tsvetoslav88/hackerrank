package daysofcode30;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
 * 
 * @author TSVETOSLAV
 *
 */
public class Day25 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int T = sc.nextInt();

			while (T-- > 0) {
				double n = sc.nextDouble();
				if (n == 1) {
					System.out.println("Not prime");
					continue;
				}

				double sq = Math.sqrt(n);
				boolean isNotPrime = true;
				for (int i = 2; i <= sq; i++) {
					if (n % i == 0) {
						isNotPrime = false;
					}
				}
				System.out.println(isNotPrime == true ? "Prime" : "Not prime");

			}

		}

	}

}
