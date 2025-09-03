package codeWithHarry_package;
import java.util.Scanner;
public class _29_TweentyNineClassWithHarry {

	public static void main(String[] args) {
		
		//Practice problem 1
//		float [] num = new float[5];
//		num[0] = 23.2F;
//		num[1] = 65.4F;
//		num[2] = 43.4F;
//		num[3] = 55.3F;
//		num[4] = 44.8F;
//		float sum = 0;
//		for(float element : num) {
//			sum = sum + element;
//		}
//		System.out.println("Sum of the float number is: "+ sum);
		
		//Practice problem 2
//		int [] num2 = new int[5];
//		num2[0] = 23;
//		num2[1] = 65;
//		num2[2] = 43;
//		num2[3] = 55;
//		num2[4] = 44;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the integer: ");
//		int n = sc.nextInt();
//		Boolean isInarray = false;
//		for(int i = 0; i<num2.length; i++) {
//			if(num2[i] == n) {
//				isInarray = true;
//				break;
//			}
//
//		}
//		
//		if(isInarray == true) {
//			System.out.println("Interger is not present in the array.");
//		}
//		else
//		{
//			System.out.println("Interger is not present in the array.");
//		}
//			
		
		
		//Practice problem 3
		
//		float [] num = new float[5];
//		num[0] = 23.2F;
//		num[1] = 65.4F;
//		num[2] = 43.4F;
//		num[3] = 55.3F;
//		num[4] = 44.8F;
//		float sum = 0;
//		float average;
//		for(float element : num) {
//			sum = sum + element;
//		}
//		System.out.println("Sum of the float number is: "+ sum);
//		average = sum/num.length;
//		System.out.println("Average marks of all students is: "+average);
		
		
		//Practice Problem 4]
		//Sum of two matrices
//		int [][] mat1 = {{1,2,3},
//								{4,5,6}};
//		
//		int [][] mat2 = {{4,2,3},
//									{8,7,9}};
//		
//		int [][] result = {{0,0,0},
//									{0,0,0}};
//		
//		
//		System.out.println("Printing the sum of two matrices: ");
//		for(int i=0; i<mat1.length; i++) {
//			for(int j=0; j<mat1[i].length; j++) {
//				result[i][j] = mat1[i][j]+mat2[i][j];
//				System.out.print(result[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		//Practice 5
		//Reverse an array
//		int [] num3 = new int[5];
//		num3[0] = 23;
//		num3[1] = 65;
//		num3[2] = 43;
//		num3[3] = 55;
//		num3[4] = 44;
//		
//		System.out.println("Original array:");
//		for(int i=0; i<num3.length; i++) {
//			System.out.print(num3[i]+" ");
//		}
		
//		int a = num3.length/2;
//		System.out.println("\n"+a);
		
//		int temp;
//		int l = num3.length;
//		int n = Math.floorDiv(l,2);
//		for(int i=0; i<n; i++) {
//			temp = num3[i];
//			num3[i] = num3[l-1-i];
//			num3[l-1-i] = temp;
//		}
//		
//		System.out.println("\nReversed array is: ");
//		for(int i=0; i<num3.length; i++) {
//			System.out.print(num3[i]+" ");
//		}
//		
		
		//Practice 6
		//Finding maximum in an array
//		int [] num4 = new int[5];
//		num4[0] = 23;
//		num4[1] = 65;
//		num4[2] = 43;
//		num4[3] = 55;
//		num4[4] = 44;
//		
//		int u = 0;
//		for(int i=0; i<num4.length; i++) {
//			if(num4[i]>u){
//				u =num4[i];
//			}
//		}
//		System.out.println("Maximum of this array is: "+u);
		
		
		//Practice 7
		//Finding minimum in an array
//		int [] num5 = new int[5];
//		num5[0] = 23;
//		num5[1] = 65;
//		num5[2] = 43;
//		num5[3] = 55;
//		num5[4] = 44;
//		
//		int min = Integer.MAX_VALUE;
//		for(int ele:num5) {
//			if(ele<min) {
//				min = ele;
//			}
//		}
//		System.out.println("Minimum of this array is: "+ min);
//		
		
		
		//Practice 8
		//Checking array is sorted or not
//		int [] num6 = new int[5];
//		num6[0] = 23;
//		num6[1] = 65;
//		num6[2] = 43;
//		num6[3] = 55;
//		num6[4] = 44;
//		
//		boolean isSorted = true;
//		for(int i = 0; i<num6.length-1; i++) {
//			if(num6[i]>num6[i+1]) {
//				isSorted = false;
//				break;
//			}
//		}
//		if(isSorted) {
//			System.out.println("Array is sorted.");
//		}
//		else 
//		{
//			System.out.println("Array is not sorted.");
//		}
//		
		
	}

}
