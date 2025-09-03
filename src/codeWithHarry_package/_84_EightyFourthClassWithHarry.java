package codeWithHarry_package;

class NegativeRadiusException extends Exception{
//	@Override
//	public String toString() {
//		return "can't be negative";
//	}
	
	@Override
	public String getMessage() {
		return "Radius can't be negative";
	}
}

public class _84_EightyFourthClassWithHarry {

	public static double area(int r) throws NegativeRadiusException{
		if(r<0) {
			throw new NegativeRadiusException();
		}
		double a = Math.PI * r * r;
		return a;
	}
	
	public static int divide(int a, int b) throws ArithmeticException{
		if(b<=0) {
			throw new ArithmeticException("Arithmetic exception occured!");
		}
		int result = a/b;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Throw vs Throws!!");
		
		try {
//			int c = divide(4,0);
//			System.out.println("Result: "+c);
			double y = area(-2);
			System.out.println("Area of the circle is: "+ y);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
