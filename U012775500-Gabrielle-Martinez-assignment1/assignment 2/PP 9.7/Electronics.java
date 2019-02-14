//PP 9.7
public class Electronics {
	protected double weight, cost, watts;
	protected String model, brand;
	private boolean isOn = false;
	
	public Electronics(String brand, String model, double weight, double cost, double powerUsage) {
		this.brand = brand;
		this.model = model;
		this.weight = weight;
		this.cost = cost;
		watts = powerUsage;
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public String toString() {
		return brand + " " + model + "\nWeight: " + weight + "\nPower use: " + watts + "\nCost: $" + cost 
				+ "\nCurrently " + (isOn==true?"ON":"OFF");
	}

}
