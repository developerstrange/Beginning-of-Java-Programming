package codeWithHarry_package;
import java.util.Scanner;

public class _19_NinteenthClassWithHarry {

	public static void main(String[] args) {
				// Question 1
		//		int a = 10; 
		//		if(a = 11) {
		//			System.out.println("I am 11");          //It will show an error cz we can't use assignment operator in the if condition
		//		}
		//		else {
		//			System.out.println("I am not 11");
		//		}
		
				
				//Question 2
		//		int sub1 = 33;
		//		int sub2 = 33;
		//		int sub3 = 33;
		//		int total =(sub1+sub2+sub3)/3;
		//		if(total>=40 && (sub1>=33 && sub2>=33 && sub3>=33)) {
		//			System.out.println("Pass!");
		//		}
		//		else {
		//			System.out.println("Fail!");
		//		}
		//		
				
				//Question 3
		//		Scanner sc = new Scanner(System.in);
		//		int salary;
		//		float tax = 0.0f;
		//		System.out.print("Enter the amount or your salary: ");
		//		salary = sc.nextInt();
		//		if(salary<250000) {
		//			tax = tax + 0;
		//			System.out.println("You don't have to pay any taxes!\nSo, your tax is: "+tax+"Taka");
		//		}
		//		else if(salary>=250000 && salary<500000) {
		//			tax = tax + ((salary-250000)*.05f);
		//			System.out.println("Your tax will be 5 % of your total salary.\nSo your tax is: "+tax+"Taka");
		//		}
		//		else if(salary>=500000 && salary<1000000) {
		//			tax = tax + ((500000-250000)*.05f)+ ((salary-500000)*.20f);
		//			System.out.println("Your tax will be 20% of your total salary.\nSo your tax is: "+tax+"Taka");
		//		}
		//		else if(salary>=1000000) {
		//			tax = tax + ((500000-250000)*.05f)+((1000000-500000)*.20f)+ ((salary-1000000)*.30f);
		//			System.out.println("Your tax will be 30% of your total salary.\nSo your tax is: "+tax+"Taka");
		//		}
				
		
				//Question 4
		//		Scanner sc = new Scanner(System.in);
		//		byte day;
		//		System.out.print("Enter the number for choosing a Day: ");
		//		day = sc.nextByte();
		//		
		//		switch(day) {
		//			case 1 ->System.out.println("Saturday!");
		//			case 2 ->System.out.println("Sunday!");
		//			case 3 ->System.out.println("Monday!");
		//			case 4 ->System.out.println("Tuesday!");
		//			case 5 ->System.out.println("Wednesday!");
		//			case 6 ->System.out.println("Thrusday!");
		//			case 7 ->System.out.println("Friday!");
		//		}
				
		//Question 4
		Scanner sc = new Scanner(System.in);
//		int year;
//		System.out.print("Enter the year: ");
//		year = sc.nextInt();
//		
//		if(year%400 == 0 || (year%4 == 0 && year%100 != 0)) {
//			System.out.println("It's a leap year.");
//		}
//		else {
//			System.out.println("It's not a leap year.");
//		}
				
		
		//Question 6
		String org;
		System.out.print("Enter the last name of the organizations: ");
		org = sc.nextLine();
		if(org.endsWith(".org")) {
			System.out.println("This is an organizational website.");
		}
		else if(org.endsWith(".com")) {
			System.out.println("This is an commercial website.");
		}
		else if(org.endsWith(".bd")) {
			System.out.println("This is an Bangladeshi website.");
		}
		else {
			System.out.println("This is an unknown website.");
		}
		
	}

}
