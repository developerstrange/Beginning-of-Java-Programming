package codeWithHarry_package;

class myThreadRunnable1 implements Runnable{
	int i = 0;

	@Override
	public void run() {
		while(i<500) {
			System.out.println("I am thread1 not threat1.");
			i++;
		}
		
	}
	
}

class myThreadRunnable2 implements Runnable{
	int i = 0;

	@Override
	public void run() {
		while(i<500) {
			System.out.println("I am thread2 not threat2.");
			i++;
		}
		
	}
	
}
public class _71_SeventyFirstClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Creating a Thread!!\nSecond way-->implementing runnable interface!");
		myThreadRunnable1 bullet1 = new myThreadRunnable1();
		Thread gun1 = new Thread(bullet1);
		
//		myThreadRunnable2 bullet2 = new myThreadRunnable2();
//		Thread gun2 = new Thread(bullet2);
		
		gun1.start();
//		gun2.start();

	}

}
