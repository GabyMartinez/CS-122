//PP 9.8
public class Maths extends Course
{
	private String department = "Mathematics";

	public Maths(String title, int courseNum, String discription) {
		super(title, courseNum, discription);
	}
	public String toString() {
		return super.toString() + "\nDepartment: " + department;
	}
	//for department can it be an abstract variable? 
}
