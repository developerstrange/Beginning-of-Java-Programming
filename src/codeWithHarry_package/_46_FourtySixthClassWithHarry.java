package codeWithHarry_package;

class base1{
	public base1() {
		System.out.println("I am a base class constructor");
	}
	public base1(int x) {
		System.out.println("I am a base class constructor with value of x is: "+x);
	}
}

class derived1 extends base1{
	public derived1() {
		System.out.println("I am derived class constructor!!");
	}
	public derived1(int x, int y) {
		super(x);
		System.out.println("I am a derived class constructor with value of y is: "+y);
	}
}

class childOfDerived extends derived1{
	public childOfDerived() {
		System.out.println("I am chlid of derived class!");
	}
	public childOfDerived(int x, int y , int z) {
		super(x, y);  //used to pass the value to the parent class constructor with values
		System.out.println("I am a child of derived class with value of z is: "+z);
	}
}
public class _46_FourtySixthClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Constructor in Inheritence!!");
		//base1 b = new base1();
		//derived1 d = new derived1();
		//childOfDerived c = new childOfDerived();

		childOfDerived c = new childOfDerived(9,3,2);
		
		//When there are multiple constructors in the parent class, the constructor without any parameters is called from the child class first. Then the parent class constructor is executed first and the the child class constructor is executed.
		//If we want to class the constructor with parameters from the parent class, we can use super keyword.
		
	}

}
