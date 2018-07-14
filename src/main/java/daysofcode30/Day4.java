package daysofcode30;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-class-vs-instance/problem?h_r=email&
 * unlock_token=2548a7c1452ce57e2d869b10214219acebb9a7a4&utm_campaign=
 * 30_days_of_code_continuous&utm_medium=email&utm_source=daily_reminder
 * 
 * @author TSVETOSLAV
 *
 */
public class Day4 {
	private int age;

	public Day4(int initialAge) {
		if (initialAge >= 0) {
			setAge(initialAge);
		} else {
			setAge(0);
			System.out.println("Age is not valid, setting age to 0.");
		}

	}

	public void setAge(int age) {
		this.age = age;
	}

	public void amIOld() {
		if (this.age < 13) {
			System.out.println("You are young.");
		} else if (this.age >= 13 && this.age < 18) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}

	}

	public void yearPasses() {
		this.setAge(this.age + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4 p = new Day4(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}

}
