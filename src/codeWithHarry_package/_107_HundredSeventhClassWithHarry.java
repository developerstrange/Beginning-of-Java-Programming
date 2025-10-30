package codeWithHarry_package;

public class _107_HundredSeventhClassWithHarry {

	/**
	 * 
	 * @param args These are the argument supplied to the command line.
	 */
	public static void main(String[] args) {
		//Method tags for generating java documentation.
		//To generate java doc for methods are same like classes. We just have to add the tags above the method for which method we want to describe.
		//Some tags are:
		// @param ---> for declaring parameters of a method
		// @return ---> for declaring about the return value
		// @throws --->for declaring exception that could be thrown
		// @depreciated ---> for declaring depreciate status
	}
	
	
	/**
	 * This method is to calculate to number summation.
	 * @param a This is the first number to add
	 * @param b This is the second number to add
	 * @return Sum of two numbers.
	 * @throws Exception if a is 0.
	 * @deprecated This method is deprecated. Please use another method.
	 */
	public int add(int a, int b) throws Exception{
		if(a==0) {
			throw new Exception();
		}
		int c = a+b;
		return c;
	}

}
