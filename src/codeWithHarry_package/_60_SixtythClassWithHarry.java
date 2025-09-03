package codeWithHarry_package;

interface basicAnimal{
	void eat();
	void sleep();
}

class monkey{
	public void jump() {
		System.out.println("Jumping!");
	}
	public void bite() {
		System.out.println("Biting!");
	}
}

class human extends monkey implements basicAnimal{
	public void eat() {
		System.out.println("Eating....");
	}
	public void sleep() {
		System.out.println("Sleeping....");
	}
}
abstract class pen{
	abstract void write();
	abstract void refil();
	
}

class fountainPen extends pen{
	public void write() {
		System.out.println("Writing with fountain pen....");
	}
	public void refil() {
		System.out.println("Refil the fountain pen....");
	}
	public void changeNib() {
		System.out.println("Change the nib!");
	}
}
public class _60_SixtythClassWithHarry {

	public static void main(String[] args) {
		monkey m = new human();      //demonstrated poly-morphism
		m.jump();
		//m.eat(); ------>Not allowed

	}

}
