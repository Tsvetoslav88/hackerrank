package hackerrank.introduction;

import java.util.Calendar;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-date-and-time/problem
 * 
 * @author cpt2tts
 *
 */
public class DateAndTime {

	public static String getDay(String day, String month, String year) {
		 Calendar cal =  Calendar.getInstance();
		 cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
		 
		 
		 String dayOfWeek = "";
		 
		 switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			dayOfWeek = "SUNDAY";
			break;
		case 2:
			dayOfWeek = "MONDAY";
			break;
		case 3:
			dayOfWeek = "TUESDAY";
			break;
		case 4:
			dayOfWeek = "WEDNESDAY";
			break;
		case 5:
			dayOfWeek = "THURSDAY";
			break;
		case 6:
			dayOfWeek = "FRIDAY";
			break;
		case 7:
			dayOfWeek = "SATURDAY";
			break;
		default:
			break;
		}
		 
		return dayOfWeek;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		System.out.println(getDay(day, month, year));
	}
}
