package daysofcode30;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/30-interfaces/problem
 * 
 * @author TSVETOSLAV
 *
 */

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator1 implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {

		return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
	}

}

public class Day19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator1();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}
