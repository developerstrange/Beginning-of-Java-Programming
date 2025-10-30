package codeWithHarry_package;

@FunctionalInterface
interface DemoAno{
	void meth1();
//	void meth2();
}

public class _109_HundredNinthClassWithHarry {

	public static void main(String[] args) {
		// Java Anonymous Classes & Lambda Expressions
		/*
		 * Anonymous Class:- Anonymous classes enable you to make your code more
		   concise. They enable you to declare and instantiate a class at the same time.
		   They are like local classes except that they do not have a name. Use them if
		   you need to use a local class only once.
		  
		 * Lambda Expressions:- One issue with anonymous classes is that if the implementation of your anonymous class is very simple, such as an interface that contains only one method, then the syntax of anonymous classes may seem unwieldy and unclear.
		   In these cases, you're usually trying to pass functionality as an argument to another method, such as what action should be taken when someone clicks a button.
		   Lambda expressions enable you to do this, to treat functionality as method argument, or code as data.
		  
		  The previous section, Anonymous Classes, shows you how to implement a base class without giving it a name. Although this is often more concise than a named class, for classes with only one method, even an anonymous class seems a bit excessive and cumbersome. 
		  Lambda expressions let you express instances of single-method classes more compactly.
		 */
		//Anonymous class
		DemoAno obj = new DemoAno() {

			@Override
			public void meth1() {
				System.out.println("I am meth1"); 	
			}

//			@Override
//			public void meth2() {
//				System.out.println("I am meth2");	
//			}
		};

		obj.meth1();
		
		DemoAno obj1 = ()->{
			System.out.println("This is meth 1");
		};
		
		obj1.meth1();
	}

}
