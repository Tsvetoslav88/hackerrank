package daysofcode30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28 {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String regExName = "^[a-z]{0,10}$";
		Pattern pName = Pattern.compile(regExName);

		String regExEmail = "^[a-z].{1,50}@gmail.com$";
		Pattern pEmail = Pattern.compile(regExEmail);

		List<String> list = new ArrayList();

		for (int NItr = 0; NItr < N; NItr++) {
			String[] firstNameEmailID = scanner.nextLine().split(" ");

			String firstName = firstNameEmailID[0];

			String emailID = firstNameEmailID[1];

			Matcher mName = pName.matcher(firstName);
			Matcher mEmail = pEmail.matcher(emailID);

			if (mName.find() && mEmail.find()) {
				list.add(mName.group());
			}

		}

		Collections.sort(list);
		for (String name : list) {
			System.out.println(name);
		}

		scanner.close();
	}
}
