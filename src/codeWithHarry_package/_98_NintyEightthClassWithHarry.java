package codeWithHarry_package;

import java.util.Calendar;
import java.util.TimeZone;

public class _98_NintyEightthClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Calender class!!");
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTimeZone());
		System.out.println(c.getTimeZone().getID());
		
		
		Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
		System.out.println(c1.getTimeZone());
		System.out.println(c1.getTimeZone().getID());
		

	}

}
