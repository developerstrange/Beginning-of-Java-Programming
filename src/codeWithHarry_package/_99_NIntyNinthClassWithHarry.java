package codeWithHarry_package;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class _99_NIntyNinthClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Gregorian Calendar!!");
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
//		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + ":"+Calendar.MINUTE+":"+Calendar.SECOND);
		System.out.println(cal.get(Calendar.SECOND));
		
		GregorianCalendar gCal = new GregorianCalendar();
		System.out.println(gCal.isLeapYear(2025));

		
		System.out.println(TimeZone.getAvailableIDs()[0]);
		System.out.println(TimeZone.getAvailableIDs()[1]);
		System.out.println(TimeZone.getAvailableIDs()[2]);
		System.out.println(TimeZone.getAvailableIDs()[3]);
		
		System.out.println(TimeZone.getDefault());
		System.out.println(TimeZone.getAvailableIDs()[0]);
		
	}

}
