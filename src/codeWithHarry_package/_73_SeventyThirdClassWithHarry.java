package codeWithHarry_package;

class myRun1 implements Runnable{	
	@Override
	public void run() {
		System.out.println("Thank You!!");
	}
	
}

//class myThr extends Thread{
//	public myThr(String name) {
//		super(name);
//	}
//	
//	@Override
//	public void run() {
//		System.out.println("Thank You!!");
//	}
//	
//}

public class _73_SeventyThirdClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Constructor in Thread!!" );
		myRun1 r1 = new myRun1();
		Thread t1 = new Thread(r1, "Kent");
		t1.start();
		System.out.println("ID of the the Runnable is: " + t1.getId());
//		myThr m1 = new myThr("Harry");
//		myThr m2 = new myThr("Jack");
//		m1.start();
//		m2.start();
//		System.out.println("The id of the thread is: " + m1.getId());
//		System.out.println("The name of the thread is: " + m1.getName());
//		System.out.println("The id of the thread is: " + m2.getId());
//		System.out.println("The name of the thread is: " + m2.getName());
	}

}
