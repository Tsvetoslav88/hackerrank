package daysofcode30;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-conditional-statements/problem?h_r=email&unlock_token=3eab8d1ffb1d75032bd0d9d6efa0232ad1601dad&utm_campaign=30_days_of_code_continuous&utm_medium=email&utm_source=daily_reminder
 * 
 * @author tstsvetk
 *
 */
public class Day3 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		if(N<1 || N>100) {
			System.out.println("Number " + N + "out of range");
		}
		
		
		if((N%2)!=0) {
			System.out.println("Weird");
		}else {
			if(N>1 && N<=5) {
				System.out.println("Not Weird");
			}else if(N>=6 && N<=20) {
				System.out.println("Weird");
			}else {
				System.out.println("Not Weird");
			}
		}

		scanner.close();
	}
}
