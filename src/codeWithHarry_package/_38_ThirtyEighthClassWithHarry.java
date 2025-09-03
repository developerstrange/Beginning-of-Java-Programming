package codeWithHarry_package;

//In a class file only one class can be public. Multiple Class can't be public. So will won't use public access modifier here. Instead we won't write anything here, which means deafult.

class Employee{
	int id;
	int salary;
	String name;
	
	public int getSalary() {
		return salary;
	}
	
	public void getDetails() {
		System.out.println("My ID is: "+id);
		System.out.println("My name is: "+name);
	}
}
public class _38_ThirtyEighthClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Creating our own custom class.");
		Employee harry = new Employee();    //Instantiating a new object
		Employee john= new Employee(); 	  //Instantiating another new object
		
		
		//Setting attributes for harry
		harry.id = 33;
		harry.name = "Code With Harry";
		harry.salary = 6700000;
		
		
		//Setting attributes for John
		john.id = 01;
		john.name = "John Wick";
		john.salary = 9700000;
		
//		System.out.println(harry.id);
//		System.out.println(harry.name);
		
		//printing details for harry
		harry.getDetails();
		harry.getSalary();
		
		//printing details for John
		john.getDetails();
		john.getSalary();

	}

}
