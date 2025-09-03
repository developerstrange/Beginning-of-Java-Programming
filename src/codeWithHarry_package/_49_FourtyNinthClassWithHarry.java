package codeWithHarry_package;

class phone{
	public void greet() {
		System.out.println("Good Morning!!");
	}
	public void on() {
		System.out.println("Turning on my phone....");
	}
}

class smartPhone extends phone{
	public void on() {
		System.out.println("Turning on my Smart Phone....");
	}
	public void music() {
		System.out.println("Playing music....");
	}
}

public class _49_FourtyNinthClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Dynamic Method Dispatch!");

		//Dynamic method dispatch is a process where execution of method is selected during runtime.
		//In runtime it is selected which method should be executed.
		
		
		phone obj = new phone();
		smartPhone obj1 = new smartPhone();
//		smartPhone obj2 = new phone();      ----> Not Allowed
		phone obj3 = new smartPhone();
		
		obj3.on();
//		obj3.music();       -----> Not Allowed
		obj3.greet();
		
	}

}
