package codeWithHarry_package;



class MyGeneric<T1, T2>{
	int val;
	private T1 t1;
	private T2 t2;
	
	public MyGeneric(int val, T1 t1, T2 t2) {
		super();
		this.val = val;
		this.t1 = t1;
		this.t2 = t2;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public T1 getT1() {
		return t1;
	}
	public void setT1(T1 t1) {
		this.t1 = t1;
	}
	public T2 getT2() {
		return t2;
	}
	public void setT2(T2 t2) {
		this.t2 = t2;
	}
	
}

public class _110_HundredTenClassWithHarry {

	public static void main(String[] args) {
		// Java Generics
		//Type parameter in java generics can not be a primitive data type.
		//Similar as template in C++
		/*
		 Java Generics, introduced in J2SE 5.0, are a powerful feature that allows
		 classes, interfaces, and methods to operate on objects of various types while
	     maintaining compile-time type safety. They enable the creation of reusable
		 code that is also more robust and easier to maintain.
		 
		 Java generics are primarily used to enhance type safety and code reusability.
		 They allow you to write classes, interfaces, and methods that can operate on objects of various types while ensuring compile-time type safety.
		 */
		
		MyGeneric <String, Integer> g1 = new MyGeneric(23, "My generic number is: ", 45);
		String str = g1.getT1();
		int num = g1.getT2();
		System.out.println(str+num);
		
		
	}

}
