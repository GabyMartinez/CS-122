//PP 9.7
public class Phone extends Electronics
{
	private double batteryLife;
		
	public Phone(String brand, String model, double weight, double cost, double powerUsage, double batteryLife) {
		super(brand, model, weight, cost, powerUsage);
		this.batteryLife = batteryLife;
	}
	
	public String toString() {
		return super.toString() + "\nBattery life: " + batteryLife + " hour" + (batteryLife>1? "s":"");
	}

}
