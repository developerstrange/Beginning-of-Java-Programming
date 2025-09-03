package codeWithHarry_package;

interface camera{
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

interface wifi{
	String[] wifiList();
	void connectWifi(String networkName);
}

class mycellPhone{
	void  makeCall(int number) {
		System.out.println("Calling....."+number);
	}
	void pickUpCall() {
		System.out.println("Connecting.....");
	}
}

class mySmartPhone extends mycellPhone implements camera, wifi{
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

public class _57_FiftySeventhClassWithHarry {

	public static void main(String[] args) {
		System.out.println("Default methods in Interfaces!!");
		
		/*
		 An interface can have static and default methods. 
		 Default methods enable use to add new functionality to existing interfaces.
		 This feature was introduced in Java 8 to ensure backward compatibility updating an interfaces
		 Classes implementing the interface need not implement the default methods.
		 Interfaces can also include private methods for default methods to use.
		 
		 
		 */
		
		mySmartPhone ms = new mySmartPhone();
		String[] s = ms.wifiList();
		for(String element: s) {
			System.out.println(element);
		}
		ms.connectWifi("Yeamin");
		
		ms.takeSnap();
		ms.recordVideo();
		ms.takePicture();
		//ms.greet();  -->Not allowed. Throw error. Private methods can't be use out the his class
		
	}

}
