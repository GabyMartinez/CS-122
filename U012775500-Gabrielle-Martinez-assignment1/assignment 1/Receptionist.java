//PP 9.2
public class Receptionist extends Employee
{

	public Receptionist(String name) {
		super(name);
	}
	
	public String greet() {
		return "Hello. How may I help you?";
	}
	
	public String bookAppointment() {
		return "We have an opening on Tuesday at 5pm. Would that be okay?";
	}
	
	public String callNext() {
		return "Number 32. The Doctor will see you now.";
	}
	
	public String toString() {
		return super.toString() + ", Position: Receptionist";
	}

}
