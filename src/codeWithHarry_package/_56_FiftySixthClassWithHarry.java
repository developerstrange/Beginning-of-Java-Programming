package codeWithHarry_package;

public class _56_FiftySixthClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Why multiple inheritence is not supported in Java?\n");
		System.out.println("Multiple inheritence is not supported in java becuase \nif we create same methods in both all the parent class then it will conflict between which parent's class method should execute.");
		
		/*
		 Multiple inheritance face problems when there exist methods with same signature in both the super class.
		 Due to such problems, Java doesn't support multiple inheritance directly but the similar concept can be achieved using interfaces.
		 A class can implement multiple interfaces and extend a class at the same time.
		 
		 Note:
		 1. Interfaces in Java is a bit like the class but with a signature difference.
		 2. An Interface can only have method signatures, fields and default methods.
		 3. The class implementing an interface needs to define the methods.(can redefine properties also but not necessary)
		 4. You can create a reference of interfaces but not the object
		 5. Interfaces methods are public by default.
		 */
		
	}

}
