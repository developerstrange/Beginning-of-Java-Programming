package codeWithHarry_package;

interface bicycle1{
	int x = 44; 			// In interface if we declare a properties then it is declared as final. even if we don't use final keyword before it. If we use final keyword then it doesn't matter.
	
	public void applyBrake();
	abstract public void speedUp();
}

interface motorCycle{
	void pressAccelerator();
	void gearUp();
}

class cycle2 implements bicycle1, motorCycle{
	
	public void pressAccelerator() {
		System.out.println("Accelerating speed...");
	}
	
	public void gearUp() {
		System.out.println("Gearing up speed....");
	}

	public void applyBrake() {
		System.out.println("Apply the brake!!");
	}
	public void speedUp() {
		System.out.println("Speed up your cycle!");
	}
	
}

public class _55_FiftyFifthClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Interface vs Abstraction!!");
		//The basic difference between interface and abstract class is:
		//Interface supports multiple inheritance which abstract class doesn't support.
		
		cycle2 c = new cycle2();
		c.gearUp();
		c.pressAccelerator();
		c.applyBrake();
		c.speedUp();
		
		//You can't modify the properties in Interfaces as they are final
		//c.x = 41;
		
		
		
		System.out.println(c.x);
		
		

	}

}
