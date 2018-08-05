package daysofcode30;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-nested-logic/problem
 * 
 * @author TSVETOSLAV
 *
 */
public class Day26 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String actual = sc.nextLine();
			String[] actualDate = actual.split(" ");

			String expect = sc.nextLine();
			String[] expectDate = expect.split(" ");

			if (Integer.parseInt(actualDate[2]) > Integer.parseInt(expectDate[2])) {
				System.out.println(getYearFine());
			} else if (Integer.parseInt(actualDate[2]) < Integer.parseInt(expectDate[2])) {
				System.out.println("0");
			} else {
				if (Integer.parseInt(actualDate[1]) > Integer.parseInt((expectDate[1]))) {
					System.out.println(getMonthFine(Integer.parseInt(actualDate[1]), Integer.parseInt(expectDate[1])));
				} else if (Integer.parseInt(actualDate[1]) < Integer.parseInt((expectDate[1]))) {
					System.out.println("0");
				} else {
					if (Integer.parseInt(actualDate[0]) > Integer.parseInt(expectDate[0])) {
						System.out
						        .println(getDayFine(Integer.parseInt(actualDate[0]), Integer.parseInt(expectDate[0])));
					} else {
						System.out.println("0");
					}
				}

			}

		}
	}

	private static int getYearFine() {
		return 10000;
	}

	private static int getMonthFine(int actualMonth, int expectMonth) {
		return 500 * (actualMonth - expectMonth);
	}

	private static int getDayFine(int actualDay, int expectDay) {
		return 15 * (actualDay - expectDay);
	}
}
