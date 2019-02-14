//PP 9.5
public class Ethnicity extends Person
{
	private String ethnicity;
	public Ethnicity(String name, String ethnicity) {
		super(name);
		this.ethnicity = ethnicity;
	}
	
	public String toString() {
		return super.toString() + "\nEthnicity: " + ethnicity;
	}

}
