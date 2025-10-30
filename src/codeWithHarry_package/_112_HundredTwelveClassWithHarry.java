package codeWithHarry_package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _112_HundredTwelveClassWithHarry {

	public static void main(String[] args) throws FileNotFoundException {
		File multiplication = new File("Multiplication.txt");
		try {
//			multiplication.createNewFile();
			
//			FileWriter fr = new FileWriter("Multiplication.txt");
//			for(int i=1; i<=10; i++) {
//				fr.write("5 * "+ i +"= " + (5*i)+"\n");
//			}
//			fr.close();
			FileReader file = new FileReader("Multiplication.txt");
			BufferedReader br = new BufferedReader(file);
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			
			File myfile = new File("Multiplication.txt");
			if(myfile.delete()) {
				System.out.println("File deleted successfully!");
			}else {
				System.out.println("File not deleted!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
