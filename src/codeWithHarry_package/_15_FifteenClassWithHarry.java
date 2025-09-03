package codeWithHarry_package;

public class _15_FifteenClassWithHarry {

	public static void main(String[] args) {
		//Question 1
		String st = "I am shiFAT.";
		System.out.println(st.toLowerCase());

		
		//Question 2
		System.out.println(st.replace(" ", "_"));
		
		
		//Question 3
		String name = "Dear <|name|>, Thanks a lot";
		System.out.println(name.replace("<|name|>","Shifat"));
		
		//Question 4
		String spaces = "This string contains double  and triple   spaces in it";
		System.out.println(spaces.indexOf("  "));
		System.out.println(spaces.indexOf("   "));
		
		
		//Question 5
		String letter1 = "\"Dear Harry, \n\tThis JAVA course is nice. \n\tThanks!\"";
		System.out.println(letter1);
		
		
		
		
	}

}
