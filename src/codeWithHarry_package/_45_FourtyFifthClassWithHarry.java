package codeWithHarry_package;

class base{
	int x;
	
	public void xDetails() {
		System.out.println("I am in X now.");
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
}

class derived extends base{
	int y;
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
}

public class _45_FourtyFifthClassWithHarry {

	public static void main(String[] args) {
		//Inheritance

		//Creating an object of class base
		base b = new base();
		b.setX(4);
		System.out.println(b.getX());
		
		//Creating an object of class derived
		derived d = new derived();
		d.setY(8);
		System.out.println(d.getY());
		d.xDetails();
		
	}

}
