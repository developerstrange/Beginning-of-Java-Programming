package codeWithHarry_package;


class myThr1 extends Thread{
public myThr1(String name) {
	super(name);
}

@Override
public void run() {
	System.out.println("Thank You!! " + getName());
}

}

public class _74_SeventyFourthClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Priorities in Threads!!");
		myThr1 p1 = new myThr1("Harry1");
		myThr1 p2 = new myThr1("Harry2");
		myThr1 p3 = new myThr1("Harry3");
		myThr1 p4 = new myThr1("Harry4");
		myThr1 p5 = new myThr1("Harry5");
		p5.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();

	}

}
