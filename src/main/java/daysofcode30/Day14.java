package daysofcode30;

import java.util.Scanner;
/**
 * https://www.hackerrank.com/challenges/30-scope/problem
 * @author tstsvetk
 *
 */
class Difference{
	private int[] elements;
  	public int maximumDifference;
  	
  	Difference(int[] elements){
  		this.elements = elements;
  	}

	public void computeDifference() {
		int max = elements[0];
		int min = elements[0];
		for(int i=0; i<elements.length; i++) {
			if(elements[i] >= max) {
				max = elements[i];
			}
			if(elements[i] <= min) {
				min = elements[i];
			}
		}
		
		maximumDifference = max - min;
		
	}
  	
  	
  	
}

public class Day14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
