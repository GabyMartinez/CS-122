//PP 9.5
public class Age extends Person
{
	private int age;
	public Age(String name, int age) {
		super(name);
		this.age = age;
	}
	public void addOneYr() {
		age += 1;
	}
	public String toString() {
		return super.toString() + "\nAge: " + age;
	}
}
