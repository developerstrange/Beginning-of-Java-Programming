package codeWithHarry_package;

public class _32_ThirtyTwoClassWithHarry_Method_Overloading {
	static void foo() {
		System.out.println("Good Morning, Bro!");
	}
	
	static void foo(String name){
		System.out.println("Good Morning " + name + " Bro!");
	}
	
	static void foo(String name, String name1){
		System.out.println("Good Morning " + name + " Bro!");
		System.out.println("Good Morning " + name1 + " Bro!");
	}
	
	static void tellJoke() {
		System.out.println("I invent a new word\n  \"Plagarism\"");
	}
	
	public static void change1(int a) {
		a = 88;
	}

	public static void change2(int [] arr) {
		arr[0] = 98;
	}
	
	public static void main(String[] args) {
		//tellJoke();
		//"Static" key word is used to make a method stable and kind of unchangeable and by using this key word in a method,
		//the method is then associated with that's method's every object so that we don't have to make object to call them. We call call them directly.
		
		
		//Case-1: Changing for Integer
		//int x = 45;
		//change1(x);
		//System.out.println("The value after changing is: "+ x);
		// The value here is not changed because when we pass an value as argument then a copy of that argument is passed as a parameter.
		//Not the actual value is passed. So the changes applies on that copy not that actual value which is argument.
		
		
		//Case-2: Changing for Array Or Object
		//int [] A = {23, 56, 65, 87, 99, 54};
		//change2(A);
		//System.out.println("The value after changing: "+ A[0]);
		//The value here is changed. Because in the case of Array and Object the reference is passed as an argument.
		//Reference is the original address of the actual value/argument. So, as the address passed as reference all operations works on the actual value because the reference is pointing towards the original value/object 
		//Same goes for integer if we pass with a pointer reference or pointer variable.
	
		//Method Overloading
		//Method overloading means many methods can be made by using the same name but the parameters must be different for it.
		
		foo();
		foo("Akim");
		foo("Akbar", "Jabbar");
		
		//Method overloading can't be performed by changing the return type of the methods.
	
	}

}
