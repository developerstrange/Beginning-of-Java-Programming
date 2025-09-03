package codeWithHarry_package;

class circle{
	public double radius;
	
	public void setR(double radius) {
		this.radius = radius;
	}
	public double area() {
		return radius*radius*Math.PI;
	}
}

class cylinder1 extends circle{
	public double height;
	public void setH(double height) {
		this.height = height;
	}
	@Override
	public double area() {
		return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
	}
}
public class _52_FiftyTwoClassWithHarry {

	public static void main(String[] args) {
		//Practice chapter 10

		
		//Problem 1
		circle c = new circle();
		c.setR(2.12);
		System.out.println("Area of this circle is: "+ c.area());
		
		cylinder1 y = new cylinder1();
		y.setR(1.80);
		y.setH(1.50);
		System.out.println("Area of this cylinder is: "+ y.area());
		
		//Problem 2
		//same as this circle and cylinder with square and cube
		
		
		
	}

}
