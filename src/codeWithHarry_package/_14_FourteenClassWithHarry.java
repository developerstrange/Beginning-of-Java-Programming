package codeWithHarry_package;

public class _14_FourteenClassWithHarry {

	public static void main(String[] args) {
		
		String name = "Shifat";
		System.out.println(name.length());
		int len = name.length();
		System.out.println("length: " + len);
		
		String name1 = "I am Shifat";
		System.out.println(name1.toLowerCase());
		String low = name1.toLowerCase();
		System.out.println(low);
		
		System.out.println(name1.toUpperCase());
		String up = name1.toUpperCase();
		System.out.println(up);
		
		
		System.out.println(name1.substring(3));
		System.out.println(name1.substring(5,9));
		
		
		String trimed = "      Shifat     ";
		System.out.println(trimed.trim());
		
		
		System.out.println(name.replace('i', 'u'));
		System.out.println(name.replace("ifa", "an"));
		
		
		System.out.println(name.startsWith("Sh"));
		System.out.println(name.endsWith("et"));

		
		System.out.println(name.charAt(2));
		
		
		String name2 = "Shifatshifatshifat";
		System.out.println(name2.indexOf('a'));
		System.out.println(name2.indexOf("ifat"));
		
		System.out.println(name2.indexOf("fat", 5));
		
		System.out.println(name2.lastIndexOf("fat"));
		System.out.println(name2.lastIndexOf("fat",8));  // read from last of the string
		
		
		System.out.println(name.equals("Shifat"));
		System.out.println(name.equals("shifat"));
		System.out.println(name.equalsIgnoreCase("shIfat"));
		
		
		System.out.println("I am escape sequence \nI want to code in java\\javascript\nI love \'java\'Does it sound good?");
		
		
		
		
	}

}
