package daysofcode30;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {
	private int[] testScores;

	Student(String firstName, String lastName, int id, int[] scores) {
		super(firstName, lastName, id);
		this.testScores = scores;
	}

	public String calculate() {
		int avgValue = 0;

		for (int score : this.testScores) {
			avgValue += score;
		}

		avgValue = avgValue / this.testScores.length;

		if (avgValue < 40) {
			return "T";
		} else if (avgValue >= 40 && avgValue < 55) {
			return "D";
		} else if (avgValue >= 55 && avgValue < 70) {
			return "P";
		} else if (avgValue >= 70 && avgValue < 80) {
			return "A";
		} else if (avgValue >= 80 && avgValue < 90) {
			return "E";
		} else {
			return "O";
		}
	}

}

public class Day12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
