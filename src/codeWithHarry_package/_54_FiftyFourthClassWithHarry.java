package codeWithHarry_package;

interface bicycle{
	
	//In interface all the methods in it should be abstract and can't be implemented just defined.
	//If we are in a Interface then it doesn't need to use abstract keyword before method to declare it as abstract. Compiler do that work for us.
	public void applyBrake();
	abstract public void speedUp();
}

class cycle1 implements bicycle{
	//If we inherit an abstract class then we use extends class but in case we inherit an interface then we use implements keyword.
	//When we are implementing a method from interface then we have to declare these methods as public.
	public void applyBrake() {
		System.out.println("Apply the brake!!");
	}
	public void speedUp() {
		System.out.println("Speed up your cycle!");
	}
	
}

public class _54_FiftyFourthClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Introduction to Interfeces!!");
		//Interface object can't be made but can be used as a reference like dynamic method dispatch
		cycle1 c = new cycle1();
		c.applyBrake();
		c.speedUp();

	}

}
