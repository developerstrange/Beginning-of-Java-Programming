package codeWithHarry_package;

abstract class parent{
	abstract public void greet();
	abstract public void name();
	public void go() {
		System.out.println("Go to your home!");
	}
}

class child1 extends parent{
	public void greet() {
		System.out.println("Good morning!!");
	}
	public void name() {
		System.out.println("What is your name?");
	}
}

abstract class child2 extends parent{
	public void greet() {
		System.out.println("Good afternoon!!");
	}
}

public class _53_FiftyThirdClassWithHarry {

	public static void main(String[] args) {
		 System.out.println("Abstract classes and Abstract methods!!");
		 
		 //Abstract method ---> it is a method which is defined without implementation in an abstract class
		 //Abstract class --> it is a class which object can't be made but which can be used as a reference to make a sub-class object
		 

		// parent p = new parent(); ----> not allowed
		 child1 c = new child1();
		 c.greet();
		 //child2 c1 = new child2();  ---->not allowed
		 
		 //A concrete class must be implement all the methods are in an abstract class otherwise it have to declare itself as abstract
		 //Abstract class can contain non-abstract method
	}

}
