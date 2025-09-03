package codeWithHarry_package;

public class _31_ThirtyOneClassWithHarry_Methods {
	static int logic(int x, int y) {
		int z;
		if(x>y) {
			z = x+y;
		}
		else {
			z = (x+y)*5;
		}
		return z;
	}

	public static void main(String[] args) {
		
		//_31_ThirtyOneClassWithHarry_Methods obj = new _31_ThirtyOneClassWithHarry_Methods();
		
		int a1 =5;
		int b1 = 7;
		int c1;
		c1 = logic(a1,b1);
		//c1 = obj.logic(a1,b1);		//If we want to call a method directly from a static method then the method which we want to call must be a static method also
		System.out.println(c1);	//Otherwise, if the method we want to call is not static then we have to make object of the class in which the method are and then we have to call that method.
		int a2 =9;
		int b2 = 3;
		int c2;
		c2 = logic(a2,b2);
		//c2 = obj.logic(a2,b2);
		System.out.println(c2);
	}

}
