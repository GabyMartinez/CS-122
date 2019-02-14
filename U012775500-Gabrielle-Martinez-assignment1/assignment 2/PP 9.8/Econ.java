//PP 9.8
public class Econ extends Course
{
	private String department = "Economics";
	
	public Econ(String title, int courseNum, String discription) {
		super(title, courseNum, discription);
	}
	public String toString() {
		return super.toString() + "\nDepartment: " + department;
	}
	public String supplyAndDemand() {
		return "Supply and Demand graph: X";
	}
	
}
