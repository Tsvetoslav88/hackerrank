package javaquizzes;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 * @author cpt2tts
 *
 */
public class StaticInitializerBlock {

	static Scanner scanner = new Scanner(System.in);
	static boolean flag = false;
	static int B;
	static int H;

	static {
		try {
			B = scanner.nextInt();
			H = scanner.nextInt();
			if (B > 0 && H > 0)
				flag = true;
			else
				throw new Exception("Breadth and height must be positive");

		} catch (Exception e) {
			System.out.println(e);
		}finally {
			scanner.close();
		}

	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class
