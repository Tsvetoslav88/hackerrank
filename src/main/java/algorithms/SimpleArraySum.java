package algorithms;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Given an array of integers, find the sum of its elements, arr = [1,2,3], 1 + 2 + 3 = 6, so return 6
 * For example, if the array , , so return .
 *
 * Function Description
 * Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.
 * simpleArraySum has the following parameter(s):
 * ar: an array of integers
 *
 * URL - https://www.hackerrank.com/challenges/simple-array-sum/problem
 *
 */
public class SimpleArraySum {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (Integer integer : ar) {
            sum += integer;
        }
        return sum;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
