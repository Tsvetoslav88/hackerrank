package daysofcode30;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-data-types/problem?h_r=email&unlock_token=cc9ea770d6ab0ddd95ed132f7ebdf6426cbb354b&utm_campaign=30_days_of_code_continuous&utm_medium=email&utm_source=daily_reminder
 * @author tstsvetk
 *
 */
public class Day1 {

	public static void main(String[] args) {
        	
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;
        
        
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        scan.nextLine();
        s2 = scan.nextLine();
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i2);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + d2);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + s2);
        
		scan.close();
	}

}
