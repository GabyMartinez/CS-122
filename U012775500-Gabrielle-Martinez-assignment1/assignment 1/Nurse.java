//PP 9.2
public class Nurse extends Employee
{
	public Nurse(String name) {
		super(name);
	}
	
	public String greet() {
		return "Hi. I'm Nurse " + name + ".";
	}
	public String runTest() {
		return "Your heart rate is a little abnormal, I'm going to run a few test.";
	}
	
	public String takeBlood() {
		return "This is going to hurt a bit.";
	}
	
	public String toString() {
		return "Nurse " + name + ", Position: Nurse";
	}

}
