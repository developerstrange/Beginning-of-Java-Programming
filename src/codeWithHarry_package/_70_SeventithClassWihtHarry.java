package codeWithHarry_package;


class myThread1 extends Thread{
	int i =0;
	@Override
	public void run() {
		while(i<100) {
			System.out.println("Cooking Thread is running.....");
			System.out.println("I am good!!");
			i++;
		}
	}
}

class myThread2 extends Thread{
	int i =0;
	@Override
	public void run() {
		while(i<100) {
			System.out.println("Music Thread is running.....");
			System.out.println("I am well!!");
			i++;
		}
	}
}
public class _70_SeventithClassWihtHarry {

	public static void main(String[] args) {
		System.out.println("Creating a Thread!!\nFirst way-->extending Thread class..");
		myThread1 t1 = new myThread1();
		myThread2 t2 = new myThread2();
		t1.start();													//start()---> method implicitly call all the methods in Thread class including new Classes that  are created using thread.
		t2.start();

	}

}
