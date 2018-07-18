package daysofcode30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem?h_r=email&unlock_token=9a661a7b491a22bea8f419df0413cf09b296e63f&utm_campaign=30_days_of_code_continuous&utm_medium=email&utm_source=daily_reminder
 * @author tstsvetk
 *
 */
public class Day8 {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneNumber = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            phoneNumber.put(name, phone);
        }
        
        System.out.println(phoneNumber.keySet());
        System.out.println(phoneNumber.values());
        
        while(in.hasNext()){
            String s = in.next();
            if(phoneNumber.containsKey(s)) {
            	System.out.println(s+ "=" + phoneNumber.get(s));
            }else {
            	System.out.println("Not found");
            }
        }
        in.close();
    }
}
