package codeWithHarry_package;

class myEmployee1{
	private int id;
	private String name;
	int salary;
	public myEmployee1() {
		
	}
	
	public myEmployee1(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public myEmployee1(String name) {
		this.name = name;
		this.salary = 10000;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name; 
	}
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
}




public class _42_FourtyTwoClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Constructors!!");
		myEmployee1 emp = new myEmployee1("Harry vai");
		System.out.println("Employee name is: "+ emp.getName());
		System.out.println("Employee salary is: "+ emp.getSalary());
	}

}
