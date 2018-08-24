package datastructures;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/2d-array/problem
 * 
 * There are 16 hourglasses in arr, and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum.
 * 
 * -9 -9 -9 1 1 1
 *  0 -9 0 4 3 2
 * -9 -9 -9 1 2 3
 *  0 0 8 6 6 0
 *  0 0 0 -2 0 0
 *  0 0 1 2 4 0
 * MaxValue => 28
 * @author tstsvetk
 *
 */
public class Array2DDS {
	// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	int maxHourglassSum = -1000;
    	for(int i=1;i<arr.length-1;i++) {
    		for(int j=1;j<arr[i].length-1;j++) {
    			int currentHourglassSum = arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i][j]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
    			if(currentHourglassSum >= maxHourglassSum) {
    				maxHourglassSum = currentHourglassSum;
    			}
    		}
    	}
    	return maxHourglassSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
    
}
