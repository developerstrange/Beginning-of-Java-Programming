package codeWithHarry_package;

public class _28_TweentyEightClassWithHarry {

	public static void main(String[] args) {
		//Multi-Dimensional Array
		//Declaration of multi-dimensional array
		int [][] marks = new int [2][3];  //Declaration of a 2D array
		int [][][] mark = new int [2][2][2]; //Declaration of a 3D array
		
		//Accessing of the array and set values into them on 2D array
		marks[0][0] = 33;
		marks[0][1] = 32;
		marks[0][2] = 43;
		marks[1][0] = 33;
		marks[1][1] = 32;
		marks[1][2] = 43;
		
		
		//Accessing of the array and set values into them on 3D array
		mark [0][0][0] = 56;
		mark [0][0][1] = 34;
		mark [0][1][0] = 223;
		mark [0][1][1] = 23;
		mark [1][0][0] = 43;
		mark [1][0][1] = 65;
		mark [1][1][0] = 76;
		mark [1][1][1] = 76;
		
		//Displaying values of 2D array using for loop
		System.out.println("Values of 2D array is: ");
		for(int i = 0; i<marks.length; i++) {
			for(int j = 0; j<marks[i].length; j++) {
				System.out.print(marks[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		//Displaying values of 3D array using for loop
		System.out.println("Values of 3D array is: ");
		for(int i = 0; i<mark.length; i++) {
			System.out.println("Layer: "+(i+1));
			for(int j = 0; j<mark[i].length; j++) {
				for(int k = 0; k<mark[i][j].length; k++) {
					System.out.print(mark[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.print("\n");
		}
	}

}
