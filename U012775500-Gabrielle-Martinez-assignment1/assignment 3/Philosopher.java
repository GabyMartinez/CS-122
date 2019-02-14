//PP 10.3
public class Philosopher implements Speaker
{

	@Override
	public void speak() {
		System.out.println("Cogito ergo sum");
	}

	@Override
	public void announce(String str) {
		System.out.println(str);
		
	}

}
