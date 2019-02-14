//PP 9.8
public class Course {
	protected int number;
	protected String title, discription;
	//protected String DEPARTMENT;
	
	public Course(String title, int courseNum, String discription) {
		this.title = title;
		number = courseNum;
		this.discription = discription;
		//this.department = department;
	}
	
	public String toString(){
		return title + " " + number + ":\n" + discription;
	}
}
