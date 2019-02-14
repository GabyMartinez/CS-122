//PP 10.3
public class Dog implements Speaker
{

	@Override
	public void speak() {
		System.out.println("WOOF!");
		
	}

	@Override
	public void announce(String str) {
		System.out.println(str);
		
	}

}
