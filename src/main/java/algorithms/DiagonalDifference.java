package algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 * <p>
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 * <p>
 * For example, the square matrix  is shown below:
 * <p>
 * 1 2 3
 * 4 5 6
 * 9 8 9
 * The left-to-right diagonal = 1+5+9=15. The right to left diagonal = 3+5+9=17. Their absolute difference is |15 - 17|=2 .
 */
public class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonals = 0;
        int rightDiagonals = 0;
        for (int j = 0; j < arr.size(); j++) {
            for (int i = 0; i < arr.get(j).size(); i++) {
                if (j == i) { // next diagonal element from the matrix
                    leftDiagonals = leftDiagonals + arr.get(j).get(i);
                    rightDiagonals = rightDiagonals + arr.get(j).get(arr.get(j).size() - 1 - i);
                }
            }
        }
        return leftDiagonals > rightDiagonals ? leftDiagonals - rightDiagonals : rightDiagonals - leftDiagonals;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
