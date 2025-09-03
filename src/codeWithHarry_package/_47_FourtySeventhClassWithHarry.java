package codeWithHarry_package;

class firstClass{
	int x;
	public firstClass(int x) {
		this.x = x;
		System.out.println("I am parent class constructor and my value is: "+x);
	}
}

class secondClass extends firstClass{
	int c;
	public secondClass(int c) {
		super(c);
		System.out.println("I am a derived class constructor!");
	}
}

public class _47_FourtySeventhClassWithHarry {

	public static void main(String[] args) {
		System.out.println("This & Super keyword!!");

		//firstClass f = new firstClass(54);
		secondClass s= new secondClass(3);
		
		//"This" is a way for us to reference an object of the class which is being created/referenced.
		// "Super" is a reference variable used to refer immediate parent class object.
		
		//1. can be used to refer immediate parent class instance variable
		//2. can be used to invoke parent class methods.
		//3. can be used to invoke parent class constructors.
	}

}
