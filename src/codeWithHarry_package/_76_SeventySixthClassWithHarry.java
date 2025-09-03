package codeWithHarry_package;

class goodMorning extends Thread{
	int i =0;
	
	@Override
	public void run() {
		while(i<200) {
			System.out.println("Good Morning!!");
			i++;
		}
	}
}

class welcome extends Thread{
	int i =0;
	
	@Override
	public void run() {
		while(i<200) {
			System.out.println("Welcome!!");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}

public class _76_SeventySixthClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Practice on Threads!!");
		
		goodMorning g = new goodMorning();
		welcome w = new welcome();
		
		g.setPriority(Thread.MAX_PRIORITY);
		w.setPriority(Thread.MIN_PRIORITY);
		System.out.println(g.getPriority());
		System.out.println(w.getPriority());
		System.out.println(g.getState());
		System.out.println(Thread.currentThread().getState());
//		g.start();
//		w.start();
		
		
	}

}
