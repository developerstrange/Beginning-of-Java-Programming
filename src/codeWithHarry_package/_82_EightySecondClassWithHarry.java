package codeWithHarry_package;

import java.util.Scanner;

public class _82_EightySecondClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Nested Try-Catch in Java!!");
		Scanner s = new Scanner(System.in);
		int [] num = new int[3];
		num[0] = 44;
		num[1] = 76;
		num[2] = 88;
		boolean flag = true;
		
		while(flag) {
			System.out.println("Enter the index of number:");
			int x = s.nextInt();
			try {
				System.out.println("Welcome!!");
				try {
					System.out.println("The value of the given index is: "+ num[x]);
					flag = false;
					 }
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Some exception occured: "+ e);
					System.out.println("Exception in level 2");
					}
			}
			catch(Exception e) {
				System.out.println("Exception: "+ e);
				System.out.println("Exception in level1");
			
			}
		}
		
		System.out.println("Thanks for using this program!");
	}
}
