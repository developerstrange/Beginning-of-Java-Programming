package codeWithHarry_package;

class A{
	int x;
	public void meth1() {
		System.out.println("I am method 1 of class A");
	}
	public void meth2() {
		System.out.println("I am method 2 of class A");
	}
}

class B extends A{
	@Override
	public void meth2() {
		System.out.println("I am method 2 of class B");
	}
	public void meth3() {
		System.out.println("I am method 3 of class B");
	}
}


public class _48_FourtyEightClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Method Overriding!!");
		
		A a = new A();
		a.meth2();
		
		B b = new B();
		b.meth2();

	}

}
