package javaquizzes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/arrays-ds/problem
 * @author tstsvetk
 * 
 * Given an array,A , of N integers, print each element in reverse order as a single line of space-separated integers
 *
 * Sample Input
 * 4
 * 1 4 3 2
 *
 * Sample Output
 * 2 3 4 1
 *
 */
public class ArraysDS {

	
	// Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
    	
    	int[] reverseArray = new int[a.length];
    	for(int i=0; i<a.length; i++) {
    		reverseArray[i] = a[a.length-i-1];
    	}
    	return reverseArray;

    }
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
    
    
}
