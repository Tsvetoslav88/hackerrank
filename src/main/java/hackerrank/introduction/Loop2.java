package hackerrank.introduction;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-loops/problem
 * 
 * @author TSVETOSLAV
 *
 */
public class Loop2 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter q queries: ");
		int t = in.nextInt();
		int result = 0;
		if (t > 0 && t < 500) {
			for (int i = 0; i < t; i++) {
				System.out.print("Enter a: ");
				int a = in.nextInt();
				System.out.print("Enter b: ");
				int b = in.nextInt();
				System.out.print("Enter n: ");
				int n = in.nextInt();
				if (a > 0 && a < 50 && b > 0 && b < 50 && n > 1 && n < 15) {
					result = a;
					for (int j = 0; j < n; j++) {
						result = result + (int) Math.pow(2, j) * b;
						System.out.print(result + " ");
					}
					System.out.println();
				}

			}
			in.close();
		}

	}
}
