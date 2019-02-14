//PP 10.3
public class Politician implements Speaker
{

	@Override
	public void speak() {
		System.out.println("I don't really believe what I'm going to say next but...");
	}

	@Override
	public void announce(String str) {
		System.out.println(str);
	}

}
