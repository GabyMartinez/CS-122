
public class Volunteer extends StaffMember{
	//---------------------------------------------------------------
	// Sets up a volunteer using the specified information.
	//---------------------------------------------------------------
	public Volunteer (String eName, String eAddress, String ePhone)
	{
		super (eName, eAddress, ePhone);
	}
	//---------------------------------------------------------------
	// Returns a zero pay value for this volunteer.
	//---------------------------------------------------------------
	public double pay()
	{
		return 0.0;
	}
	//10.2
	public int vacationDays() {
		return 0;
	}
}
