package codeWithHarry_package;
import java.util.Scanner;

public class TwelvethClassWithHarry {

	public static void main(String[] args) {
		//Practice day
		
		//Question 1
		float a = 7/4.0f*9/2.0f;
		System.out.println(a);
		
		
		//Question 2
		
		char grade = 'A';
		grade = (char) (grade +8);
		System.out.println(grade);
		
		//Decrypting the grade
		grade = (char) (grade - 8);
		System.out.println(grade);
		
		
		
		//Question 3
		Scanner input = new Scanner(System.in);
		int giv = 8;
		System.out.println("The given number is: "+giv);
		
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		
		System.out.println(num>giv);
		
		
		//Question 4
		int v = 4;
		int u = 7;
		int a1 = 3;
		int s = 2;
		
		int x = (v*v-u*u)/(2*a1*s);
		
		
		//Question 5
		
		int x1 =7;
		int a2 = (int) (7*49/7 + 35/7);
		System.out.println(a2);
		
		
		
		
		
	}

}
