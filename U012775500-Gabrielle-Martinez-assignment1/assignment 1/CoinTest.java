//PP.9.1
public class CoinTest {

	public static void main(String[] args) {
		
		//testing modified Coin class
		Coin a = new Coin();
		System.out.println("Coin a: " + a);
		a.flip();
		System.out.println("Coin a flipped: " + a);
		
		//testing MonetaryCoin class
		MonetaryCoin nickel = new MonetaryCoin(5);
		System.out.println("Nickel: " + nickel);
		nickel.flip();
		System.out.println("Nickel flipped: " + nickel);
		
		MonetaryCoin dime = new MonetaryCoin(10);
		int total = dime.getValue() + nickel.getValue();
		System.out.print("Total: " + total);
	}

}
