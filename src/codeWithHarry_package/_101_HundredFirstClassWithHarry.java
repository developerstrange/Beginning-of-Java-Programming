package codeWithHarry_package;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _101_HundredFirstClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Date time formatter!!");
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E -- H:m:s a");
		DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
		
		System.out.println(dt.format(df));
		System.out.println(dt.format(df2));

	}

}
