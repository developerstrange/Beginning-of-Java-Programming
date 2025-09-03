package codeWithHarry_package;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class _102_HundredSecondClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Practice Set!!");
		
		//Problem 1
		ArrayList<String> name = new ArrayList<>();
		name.add("Jack");
		name.add("Peter");
		name.add("Tony");
		name.add("Michael");
		name.add("John");
		name.add("Smith");
		name.add("Willow");
		name.add("Garage");
		name.add("Clark");
		name.add("Kent");
		
		for(String n: name) {
			System.out.println(n);
		}
		
		//Problem 4
		LocalTime d = LocalTime.now();
		
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("H:m:s");
		System.out.println(d.format(df1));
		
		//Problem 2
		Date d1 = new Date();
		System.out.println(d.getHour()  + ":" + d.getMinute() + ":" + d.getSecond());
		
		//Problem 3
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.get(Calendar.HOUR_OF_DAY) + ":" + c1.get(Calendar.MINUTE) + ":" + c1.get( Calendar.SECOND));
		
		//Problem 5
		HashSet<Integer>  J = new HashSet<>();
		
		J.add(45);
		J.add(4);
		J.add(99);
		J.add(6);
		J.add(9);
		J.add(6);
		
		for(int el:J) {
			System.out.println(el);
		}
		
		
		
		
		
	}

}
