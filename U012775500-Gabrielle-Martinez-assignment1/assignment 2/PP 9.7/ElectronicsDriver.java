//PP 9.7
public class ElectronicsDriver {

	public static void main(String[] args) {
		Electronics a = new Electronics("Samsung", "Galaxy S8", .92, 300, 2.1);
		System.out.println("[Electronics Class]\n" + a);
		System.out.println("_________________");
		
		Computer b = new Computer("HP", "Envy 13", 3.2, 1300, 12.1, "Windows 10", false);
		b.turnOn();
		System.out.println("[Computer Class]\n" + b);
		System.out.println("_________________");
		
		Phone c = new Phone("Samsung", "Galaxy S8", .92, 300, 2.1, 10);
		System.out.println("[Phone Class]\n" + c);
		System.out.println("_________________");

	}

}
