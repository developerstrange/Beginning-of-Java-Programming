package codeWithHarry_package;

public class _85_EightyFifthClassWithHarry {
	public static int greetYou() {
		try {
			int a = 40;
			int b = 0;
			int c = a/b;
			return c;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Cleaning up resources....");
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("Finally block!!");
		int k = greetYou();
		System.out.println(k);
		int a = 60;
		int b = 4;
		while(true) {
			try {
				System.out.println(a/b);
			}
			catch(Exception e) {
				System.out.println(e);
				break;
			}
			finally {
				System.out.println("Program finished!!");
			}
			b--;
		}

	}

}
