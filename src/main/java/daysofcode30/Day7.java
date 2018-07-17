package daysofcode30;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-arrays/problem?h_r=email&unlock_token=039de4f89f19e41fe3171f22e6236a66ac0a809a&utm_campaign=30_days_of_code_continuous&utm_medium=email&utm_source=daily_reminder
 * @author tstsvetk
 *
 */
public class Day7 {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scanner.nextLine();
		
		int[] arr = new int[n];
		
		String[] arrItems = scanner.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}
		
        scanner.close();
	}
	
}
