package codeWithHarry_package;
import java.util.Scanner;

public class _79_SeventyNinthClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Errors and Exception demonstration!!");
			Scanner sc = new Scanner(System.in);
			
			
			//SYNTAX ERROR Demo
			// int a = 8    //Error: semicolon error
			// b = 9    //Error: variable isn't declared
			
			
			//LOGICAL ERRROR Demo
			//Write a program to print all prime numbers between 1 to 10
			System.out.println(2);
			for(int i = 1; i<5; i++) {
				System.out.println(2*i+1);
			}
			//--->don't print all prime numbers
			
			
			//RUNTIME ERROR Demo
			int k;
			k= sc.nextInt();
			System.out.println("Integer part of 1000 divided by k is: "+ 1000/k);

			//-->if 0 is used as K then program crashes
			
	}

}
