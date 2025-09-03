package practiceDay1;

import java.util.Scanner;

public class PracticeDay1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int firstNumber = s.nextInt();
		System.out.print("Enter the second number: ");
		int secondNumber = s.nextInt();
		
		int sum = firstNumber+secondNumber;
		int division = firstNumber/secondNumber;
		int multiplication = firstNumber*secondNumber;
		int substraction = firstNumber - secondNumber;
		
		System.out.println(sum);
		System.out.println(substraction);
		System.out.println(multiplication);
		System.out.println(division);
		
		System.out.print("Enter the float number:");
		float f = s.nextFloat();
		int F = (int)f;
		System.out.println(f);
		System.out.println(F);

}
}