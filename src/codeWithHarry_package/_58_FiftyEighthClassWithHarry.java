package codeWithHarry_package;

interface sampleClass{
	void meth1();
	void meth2();
}

interface childClass extends sampleClass{
	void meth3();
	void meth4();
}

class myClass implements childClass{
	public void meth1() {
		System.out.println("Meth 1");
	}
	public void meth2() {
		System.out.println("Meth 2");
	}
	public void meth3() {
		System.out.println("Meth 3");
	}
	public void meth4() {
		System.out.println("Meth 4");
	}
}


public class _58_FiftyEighthClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Inheitance in Interfaces!!");

		myClass m = new myClass();
		m.meth1();
		m.meth2();
		m.meth3();
		m.meth4();
	}

}
