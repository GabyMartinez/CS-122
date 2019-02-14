//PP 9.5
public class Income extends Person
{
	private double income;
	
	public Income(String name, double income) {
		super(name);
		this.income = income;
	}
	
	public void setIncome(double income) {
		this.income = income;
	}
	
	public double getIncome() {
		return income;
	}
	public String toString() {
		return super.toString() + "\nIncome: " + income;
	}
	
}
