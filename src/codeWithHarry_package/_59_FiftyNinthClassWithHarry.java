package codeWithHarry_package;

interface camera1{
	void takeSnap();
	void recordVideo();
	
	private void greet() {
		System.out.println("Good morning!!");
	}
	
	default void takePicture() {
		System.out.println("Taking picture..");
		greet();
	}
}

interface wifi1{
	String[] wifiList();
	void connectWifi(String networkName);
}

class mycellPhone1{
	void  makeCall(int number) {
		System.out.println("Calling....."+number);
	}
	void pickUpCall() {
		System.out.println("Connecting.....");
	}
}

class mySmartPhone1 extends mycellPhone1 implements camera1, wifi1{
	public String[] wifiList() {
		System.out.println("List of the available wifi is: ");
		String[] network = {"Yeamin", "Zakaria", "Shaheen"};
		return network;
	}
	
	public void connectWifi(String networkName) {
		System.out.println("Connected to ..." + networkName);
	}
	
	public void takeSnap() {
		System.out.println("Taking Snap..");
	}
	
	public void recordVideo() {
		System.out.println("Recording video....");
	}
}



public class _59_FiftyNinthClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Polymorphism in interfaces!");
		
		//It is actually a dynamic method dispatch. Where we can use an interface as a reference and can create object of a class as interface can't create object.
		//If we use reference of an interface then we can not  use other methods. We can only use of that interface methods.
		
	    camera1  p = new mySmartPhone1();
		p.takePicture();
		//p.connectWifi();     --->Not allowed
		
		
		mySmartPhone1 p1 = new mySmartPhone1();
		p1.connectWifi("Yeamin");
		
		

	}

}
