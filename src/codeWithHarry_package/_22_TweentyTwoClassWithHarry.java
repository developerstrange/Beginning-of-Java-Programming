package codeWithHarry_package;
import java.util.Scanner;

public class _22_TweentyTwoClassWithHarry {

	public static void main(String[] args) {
		// Do-while loop. If first prints or executes and then check the condition. It executes at least once.
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number u want to print to: ");
		n = sc.nextInt();
		int i = 0;
		do {
			System.out.println(i+1);
			i++;
		}while(i<n);
		

	}

}
