//PP 9.2
public class Doctor extends Employee
{
	public Doctor(String name) {
		super(name);
	}
	
	public String diagnose() {
		return "Well, the good news is your test is negative.";
	}
	
	public String greet() {
		return "Hello, I'm Dr." + name + ".";
	}
	
	public String toString() {
		return "Dr. " + name + ", Position: Doctor";
	}
}
