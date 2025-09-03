package codeWithHarry_package;
import java.util.Scanner;

public class _81_EightyFirstClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Handling Specific Exception!!");
		Scanner s = new Scanner(System.in);
		int [] num = new int[3];
		num[0] = 44;
		num[1] = 76;
		num[2] = 88;
		
		System.out.println("Enter the index of the number u want to divide: ");
		int ind = s.nextInt();
		System.out.println("Enter the number by which u want to divide: ");
		int n = s.nextInt();
		
		try {
			System.out.println("The value to the index u entered is: " + num[ind]);
			System.out.println("The result of the division is: " + num[ind]/n);
		}
		catch(ArithmeticException e){
			System.out.println("Some exception occured and that is: "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Some exception occured and that is: "+e);
		}
		catch(Exception e) {
			System.out.println("Some exception occured and that is: "+e);
		}
		
		

	}

}
