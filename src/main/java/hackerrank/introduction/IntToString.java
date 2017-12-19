package hackerrank.introduction;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-int-to-string/problem
 * @author cpt2tts
 *
 */
public class IntToString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		if(n > -100 && n <= 100){
			String s = String.valueOf(n);
			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		}else{
			System.out.println("The input parameter has to be in the range between -100 and 100");
		}

	}
}
