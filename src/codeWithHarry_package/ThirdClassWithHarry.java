package codeWithHarry_package;

import java.util.Scanner;

public class ThirdClassWithHarry {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int a,b,c;
		
		System.out.print("Enter the first number:");
		a = scanner.nextInt();
		System.out.print("Enter the second Number:");
		b = scanner.nextInt();
		System.out.print("Enter the second Number:");
		c= scanner.nextInt();
		
		System.out.println("Sum of these three number is: "+(a+b+c));
	}

}
