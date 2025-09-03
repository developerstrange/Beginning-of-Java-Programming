package codeWithHarry_package;

public class _33_ThirtyThreeClassWithHarry {
//	static int sum(int a, int b) {
//		return a+b;
//	}
//	
//	static int sum(int a, int b, int c) {
//		return a+b+c;
//	}
	
//	static int sum(int ... arr) {
//		int result = 0;
//		for(int element: arr) {
//			result+=element;
//		}
//		return result;
//	}
	
	//If we want at least one argument compulsory
	
	static int sum(int x,int ... arr) {
		int result = 0;
		for(int element: arr) {
			result+=element;
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		 System.out.println("Welcome to VarArgs");
		 
		 //when we create a function and again create the same function with same name but different parameter then it is method overloading.
		 //for that, we need to create again and again new function/method with different parameter.
		 //But we can ignore this problem by creating a new function with a specific method.
		 //public static void foo(datatype ... arr)
		 //It will take as many arguments we give and then represent them in an array to the function/Method.
		 
		 System.out.println("Sum of 4, and 5 is: "+ sum(4,5));
		 System.out.println("Sum of 4, 8 and 5 is: "+ sum(4,8,5));

		 
	}

}
