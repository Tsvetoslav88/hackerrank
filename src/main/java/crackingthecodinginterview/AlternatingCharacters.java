package crackingthecodinginterview;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 * @author tsvetoslav
 *
 */
public class AlternatingCharacters {
	
	// Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
    	
    	char[] chars = s.toCharArray();
    	int cntDelition = 0;
    	for(int i=0; i<chars.length-1; i++) {
    		if(chars[i] == chars[i+1]) { // Compare the current symbol with the next. If they are equals, rise counter with 1
    			cntDelition++;
    		}
    	}
    	
    	return cntDelition;
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
