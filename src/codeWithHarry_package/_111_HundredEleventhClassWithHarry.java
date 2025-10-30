package codeWithHarry_package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class _111_HundredEleventhClassWithHarry {

	public static void main(String[] args) {
		// File handling in Java.
		
		//Creating a file
//		File myFile = new File("My_File.txt");
//		try {
//			myFile.createNewFile();
//		} catch (IOException e) {
//			System.out.println("Unable to create this file!");
//			e.printStackTrace();
//		}
		
		//Writing to File
//		try {
//			FileWriter fileWriter = new FileWriter("My_File.txt");
//			fileWriter.write("Hi, I am shifat!\nAnd you?\nWhat are u doing tonight?");
//			fileWriter.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//Reading a file
		//Using scanner
//		File myfile = new File("My_File.txt");
//		try {
//			Scanner sc = new Scanner(myfile);
//			while(sc.hasNextLine()) {
//				String line = sc.nextLine();
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//
//		//Using buffer reader
//		try {
//			FileReader fr1 = new FileReader("My_File.txt");
//			BufferedReader bf1 = new BufferedReader(fr1);
//			String line1;
//			while((line1 = bf1.readLine()) != null) {
//				System.out.println(line1);
//			}
//			bf1.close();	
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		//Deleting a file
		File myfile = new File("My_File.txt");
		if(myfile.delete()) {
			System.out.println("File deleted successfully!");
		}else {
			System.out.println("File deleting failed due to some error!");
		}
		
	}

}
