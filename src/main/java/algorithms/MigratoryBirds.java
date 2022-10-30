package algorithms;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 */
public class MigratoryBirds {
    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        int maxFreq = 0;
        int number = -1;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i:arr){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
        }
        Set<Integer> keySet = m.keySet();
        for(Integer i:keySet){
            if(m.get(i) > maxFreq){
                number = i;
                maxFreq = m.get(i);
            }
        }

        return number;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
