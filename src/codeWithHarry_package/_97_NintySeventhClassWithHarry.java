package codeWithHarry_package;

import java.util.Date;

public class _97_NintySeventhClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Date class!");
		Date d = new Date();
		System.out.println("The date is: "+d);
		System.out.println(d.getDate());
		System.out.println(d.getTime());
		System.out.println(d.getHours());    				//----->The cross defines that the method are de-pricated.
		System.out.println(d.getYear());
		

	}

}
