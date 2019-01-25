package javas;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-primality-test/problem
 * @author tsvetoslav
 *
 */
public class Primality {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        BigInteger bigInt = new BigInteger(n);
        System.out.println(bigInt.isProbablePrime(10)?"prime":"not prime");
        scanner.close();
	}
}
