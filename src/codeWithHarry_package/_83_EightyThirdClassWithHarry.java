package codeWithHarry_package;
import java.util.Scanner;

class myException extends Exception{
//	@Override
//	public String toString() {
//		return "I am toString";
//	}
	
	@Override
	public String getMessage() {
		return "I am getMessage";
	}
}

public class _83_EightyThirdClassWithHarry {

	public static void main(String[] args) {
		System.out.println("The Exception Class in java!!");
		Scanner s = new Scanner(System.in);
		int a;
		a = s.nextInt();
		if(a<9) {
			try {
				throw new myException();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
//				System.out.println(e.toString());
				e.printStackTrace();
				System.out.println(e);
			}
		}
	}

}
