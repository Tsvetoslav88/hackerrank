package algorithms;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 *
 *
 */
public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int[] scoreMaxMin = {scores.get(0), scores.get(0)};//max,min
        int[] count = {0,0}; //max,min

        for(Integer score: scores) {
            if(score > scoreMaxMin[0]) {
                scoreMaxMin[0] = score;
                count[0]++;
            }
            if(score < scoreMaxMin[1]) {
                scoreMaxMin[1] = score;
                count[1]++;
            }
        }
        return Arrays.asList(count[0],count[1]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = breakingRecords(scores);
        result.forEach(System.out::println);

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
