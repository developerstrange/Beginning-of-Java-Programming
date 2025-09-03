package codeWithHarry_package;

class cylinder{
	
	private double radius;
	private double height;
	
	public cylinder() {
		
	}
	
	public cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getRadius() {
		return radius;
	}
	public double getHeight() {
		return height;
	}
	
	public double surfaceArea() {
		double s =  ((2*Math.PI*radius*height) +(2*Math.PI*radius*radius));
		return s;
	}
	public double volum() {
		double v = Math.PI*radius*radius*height;
		return v;
	}
	
}

public class _44_FourtyFourClassWithHarry {

	public static void main(String[] args) {
		
//		cylinder cy = new cylinder();
		cylinder cy = new cylinder(2.99,2.00);
//		cy.setHeight(2.00f);
//		cy.setRadius(3.99f);

		System.out.println("Height is: "+ cy.getHeight());
		System.out.println("Radius is: "+ cy.getRadius());
		System.out.println("Surface area is: "+ cy.surfaceArea());
		System.out.println("Volume is: "+ cy.volum());
	}

}
