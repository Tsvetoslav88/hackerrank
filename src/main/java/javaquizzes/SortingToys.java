package javaquizzes;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * Given a list of prices and an amount to spend, what is the maximum number of
 * toys Mark can buy? For example, if prices = [1,2,3,4] and Mark has k=7 to
 * spend, he can buy items [1,2,3] for 6, or [3,4] for 7 units of currency. He
 * would choose the first group of items.
 * https://www.hackerrank.com/challenges/mark-and-toys/problem?h_l=playlist&slugs%5B%5D=interview&slugs%5B%5D=interview-preparation-kit&slugs%5B%5D=sorting
 * 
 * @author tstsvetk
 * 
 *
 */
public class SortingToys {
	
	// Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
    	
    	Arrays.sort(prices);
    	
    	int maxNumberOfToys = 0;
    	
    	if(prices[1]>k) {
    		return maxNumberOfToys;
    	}else {
    		maxNumberOfToys=1;
    		k = k - prices[1];
    	}
    	
    	
    	for(int i=0; i<prices.length-1; i++) {
    		if(prices[i]+prices[i+1] < k) {
    			maxNumberOfToys++;
    			k = k - prices[i+1];
    		}
    	}
    	return maxNumberOfToys;
    }
	
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] prices = new int[n];

		String[] pricesItems = scanner.nextLine().split(" ");
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int pricesItem = Integer.parseInt(pricesItems[i]);
			prices[i] = pricesItem;
		}

		int result = maximumToys(prices, k);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
