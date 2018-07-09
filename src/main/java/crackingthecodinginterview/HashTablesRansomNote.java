package crackingthecodinginterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=playlist&slugs%5B%5D=interview&slugs%5B%5D=interview-preparation-kit&slugs%5B%5D=dictionaries-hashmaps
 * 
 * @author tstsvetk
 * 
 * Complete the checkMagazine function in the editor below. It must print Yes if the note can be formed using the magazine, or .No
 * checkMagazine has the following parameters:
 * - magazine: an array of strings, each a word in the magazine
 * - note: an array of strings, each a word in the ransom note
 *
 * Sample input:
 * 6 4
 * give me one grand today night
 * give one grand today
 * 
 * Sample output:
 * Yes
 */

public class HashTablesRansomNote {
	
	// Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

    	// Create Map which will keep all magazine words
		Map<String, Integer> magazineMap = new HashMap<>();
    	
    	// Fill the Map with magazine words 
    	for(String magazineWord: magazine) {
    		if(magazineMap.get(magazineWord)!=null) {
    			magazineMap.put(magazineWord, magazineMap.get(magazineWord)+1);
    		}else {
    			magazineMap.put(magazineWord, 1);
    		}
    	}
    	
    	// Check if all words for note are available in magazine
    	for(String noteWord: note) {
    		if(!magazineMap.containsKey(noteWord)) {
    			System.out.println("No");
    			return;
    		}else {
    			int value = magazineMap.get(noteWord)-1;
    			if(value==0) {
    				magazineMap.remove(noteWord);
    			}else {
    				magazineMap.put(noteWord, value);
    			}
    		}
    	}
    	
    	System.out.println("Yes");

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
