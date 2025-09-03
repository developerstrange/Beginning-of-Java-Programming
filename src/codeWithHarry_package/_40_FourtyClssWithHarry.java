package codeWithHarry_package;

class myEmployee{
	private int id;
	private String name;
	
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
}
public class _40_FourtyClssWithHarry {

	public static void main(String[] args) {
		System.out.println("Access modifier and getters & setters.");

		//Access modifier specifies where and who can access attributes/methods
		//Follow oracle access modifier table
		myEmployee em1 = new myEmployee();
		em1.setId(2);
		em1.setName("Harry code");
		System.out.println("Your name is: "+ em1.getName());
		System.out.println("Your id is: "+ em1.getID());
		
		
	}

}
