package algorithms;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 *
 * In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
 *
 * Function Description
 *
 * Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
 *
 * aVeryBigSum has the following parameter(s):
 *
 * int ar[n]: an array of integers .
 * Return
 *
 * long: the sum of all array elements
 * Input Format
 *
 * The first line of the input consists of an integer .
 * The next line contains  space-separated integers contained in the array.
 *
 * Output Format
 *
 * Return the integer sum of the elements in the array.
 *
 * Constraints
 *
 *
 * Sample Input
 *
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 * Output
 *
 * 5000000015
 */
public class VeryBigSum {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        return ar.stream().mapToLong(Long::longValue).sum();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long result = aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
