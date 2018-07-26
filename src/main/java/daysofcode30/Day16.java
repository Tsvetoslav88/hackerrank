package daysofcode30;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem
 * @author tstsvetk
 *
 */
public class Day16 {

	public static void main(String[] args) {
	        try(Scanner in = new Scanner(System.in)){
	        	String S = in.next();
	        	
	        	try {
	        		int parseInt = Integer.parseInt(S);
	        		System.out.println(parseInt);
	        	}catch (NumberFormatException e) {
					System.out.println("Bad String");
				}
	        }
	        
	        
	}

}
