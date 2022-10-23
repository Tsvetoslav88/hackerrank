package datastructures;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


/**
 * https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=playlist&slugs%5B%5D=interview&slugs%5B%5D=interview-preparation-kit&slugs%5B%5D=stacks-queues
 * @author tstsvetk
 *
 * A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
 * Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. 
 *
 * Sample Input
 * 3
 * {[()]}
 * {[(])}
 * {{[[(())]]}}
 * 
 * Sample Output
 * YES
 * NO
 * YES
 *
 */
public class BalancedBrackets {

	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i=0; i<t; i++) {
        	String s = scanner.nextLine();
        	
        	String result = isBalanced(s);
        	
        	bufferedWriter.write(result);
        	bufferedWriter.newLine();
        	
        	
        }
        
        bufferedWriter.close();

        scanner.close();
	}
	
	
	// Complete the isBalanced function below.
    static String isBalanced(String s) {
    	
    	Stack<String> stack = new Stack<String>();
    	
    	String[] split = s.split("");
    	for (String string : split) {
    		
    		if(string.equals("{") || string.equals("[") || string.equals("(")) {
    			stack.push(string);
    		}else {
    			if (stack.isEmpty()) {
					return "NO";
				}
    			
    			if(string.equals("}")) {
    				if(!stack.pop().equals("{")) {
    					return "NO";
    				}
    			}else if(string.equals("]")) {
    				if(!stack.pop().equals("[")) {
    					return "NO";
    				}
    			}else if(string.equals(")")) {
    				if(!stack.pop().equals("(")) {
    					return "NO";
    				}
    			}
    		}
    		
		}
    	
    	if(!stack.isEmpty()) {
    		return "NO";
    	}
    	
    	
    	return "YES";

    }
}
