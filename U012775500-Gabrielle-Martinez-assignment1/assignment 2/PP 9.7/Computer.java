//PP 9.7
public class Computer extends Electronics
{
	//private boolean isMac;
	private boolean isTouchScreen;
	private String os;
	
	public Computer(String model, String brand, double weight, double cost, double powerUsage, String osTypeNum, Boolean touchScreen) {
		super(model, brand, weight, cost, powerUsage);
	//	this.isMac = isMac;
		isTouchScreen = touchScreen;
		os = osTypeNum;
	}
	
	public String toString() {
		return super.toString() + "\nOS: " + os + "\nTouch Screen: " + (isTouchScreen==true? "Yes":"No");
	}
	
	/*	
	private void findOS() {
		if (isMac == true)
			os = "iOS";
		else
			os = "Windows";
	}
*/	

}
