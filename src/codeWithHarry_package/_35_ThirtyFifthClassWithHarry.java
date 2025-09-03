package codeWithHarry_package;
import java.util.Scanner;

public class _35_ThirtyFifthClassWithHarry {
	static void multiplication(int n) {
		for(int i=1; i<=10; i++) {
			System.out.format("%d * %d = %d\n", n, i, n*i);
		}
	}
	
	static void pattern1(int m) {
		for(int i=0; i<m; i++ ) {
			for(int j=0; j<i+1; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
	
	static int sum (int n) {
		if(n == 0) {
			return 0;
		}
		int s; 
		s = n + sum(n-1);
		return s;
	}
	
	static void pattern2(int o) {
		for(int i=0; i<o; i++) {
			for(int j=0; j<o-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static int fib(int n) {
		/*if(n == 1) {
			return 0;
		}
		else if(n == 2) {
			return 1;
		}*/
		if(n ==1 || n==2) {
			return n-1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	static int average(int ... arr) {
		int sum =0; 
		for(int element : arr) {
			sum += element;
		}
		int average = sum/arr.length;
		return average;
	}
	
    static void pattern1_rec(int n) {
		if(n>0) {
			pattern1_rec(n-1);
			
			for(int i=0;  i<n;  i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
    
    static void pattern2_rec(int n) {
		if(n>0) {
			for(int i=0;  i<n;  i++) {
				System.out.print("* ");
			}
			System.out.println();
			pattern2_rec(n-1);
		}
	}
    
    static int cel_fer(int n) {
    	int f = 32 + (n * (9/5));
    	return f;
    }
    
    static void sum_iterative(int n) {
    	int sum = 0;
    	for(int i = 1; i<=n; i++) {
    		sum = sum+i;
    	}
    	System.out.println(sum);
    }

	public static void main(String[] args) {
		System.out.println("\t\tWelcome to Practice question on Methods\n");
		Scanner sc = new Scanner(System.in);
		
		//Problem 1
		
//		int n;
//		System.out.print("Enter the number for multiplicaion table: ");
//		n = sc.nextInt();
//		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i+ " * " + n + " = " + i*n);
//		}
//		multiplication(5);
		
		//Problem 2
//		pattern1(5);
		
		
		//Problem 3
//		System.out.println(sum(10));
		
		//Problem 4
//		pattern2(5);

		
		//Problem 5
//		int n;
//		System.out.print("Enter the position of the fibonacci number: ");
//		n = sc.nextInt();
//		System.out.println("The "+n+"th term of fibonacci series is: "+fib(n));
		
		
		//Problem 6
//		System.out.println("Average of the given numbers is: "+ average(10,20,30));
		
		
		//Problem 7
//		pattern2_rec(5);
		
		//Problem 8
//		pattern1_rec(5);
		
		
		//Problem 9
//		System.out.println("The fernheit temperature of your given celsius is: " + cel_fer(0));
		
		//Problem 10
//		sum_iterative(10);
		
		
	}

}
