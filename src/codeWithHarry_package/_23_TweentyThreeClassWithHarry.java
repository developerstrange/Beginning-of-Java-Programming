package codeWithHarry_package;

import java.util.Scanner;

public class _23_TweentyThreeClassWithHarry {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number u want to print to: ");
		n = sc.nextInt();
		for(int i = 0;  i<n;  i++) {
			System.out.println(2*i+1);
		}
		
		//decrementing for loop
		System.out.println("In reverse order: ");
		for(int i = 4;  i>=0;  i--) {
			System.out.println(2*i+1);
		}

	}

}
