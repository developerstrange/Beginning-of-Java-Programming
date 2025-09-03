package codeWithHarry_package;


class myNewThr1 extends Thread{

	@Override
	public void run() {
		int i = 0;
		while(i<100) {
			System.out.println("Thank You!! ");
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}

}


class myNewThr2 extends Thread{

	@Override
	public void run() {
		int j = 0;
		while(j<10) {
			System.out.println("My Thank You!! ");
			j++;
		}
	}

}



public class _75_SeventyFifthClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Thread methods!!");
		myNewThr1 n1 = new myNewThr1();
		myNewThr2 n2 = new myNewThr2();
		n1.start();
//		try {
//			n1.join();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		n2.start();
	}

}
