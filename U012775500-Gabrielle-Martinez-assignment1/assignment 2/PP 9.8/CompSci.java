//PP 9.8
public class CompSci extends Course
{
	private String department;
	
	public CompSci(String title, int courseNum, String discription) {
		super(title, courseNum, discription);
		department = "Computer Science";		
	}
	
	public String memeOfTheDay() {
		return "I think you forgot this: ;";
	}
	
	public String toString() {
		return super.toString() + "\nDepartment: " + department;
	}

}
