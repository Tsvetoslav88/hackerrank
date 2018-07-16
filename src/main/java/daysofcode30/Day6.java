package daysofcode30;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-review-loop/problem?h_r=email&unlock_token=8b45db3b8fed4c6500bcf61ac691611ae355c73d&utm_campaign=30_days_of_code_continuous&utm_medium=email&utm_source=daily_reminder
 * @author tstsvetk
 *
 */
public class Day6 {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter number of test cases: ");
		int T = scanner.nextInt();
		String s;
		
		for(int i=1; i<=T; i++) {
			System.out.println("Enter word: ");
			 s = scanner.next();
			
			char[] wordToChar = s.toCharArray();
			
			String evenIndex = new String();
			String oddIndex = new String();
			for(int j=0; j<wordToChar.length; j++) {
				if(j==0 || j%2==0) {
					evenIndex += wordToChar[j];
				}else {
					oddIndex += wordToChar[j];
				}
			}
			
			System.out.println(evenIndex + " "+ oddIndex);
			
		}
	}
}
