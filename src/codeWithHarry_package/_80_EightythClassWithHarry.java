package codeWithHarry_package;

public class _80_EightythClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Try & Catch block in Java!!");
		int a = 9999;
		int b = 0;
		try {
			int c = a/b;
			System.out.println("Result is: "+c);
		}
		catch(Exception e) {
			System.out.println("We failed to run.\nReason is: "+e);
		}

		System.out.println("Program Ends!!");
	}

}
