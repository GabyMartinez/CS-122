//PP.9.1
//child class of Coin
public class MonetaryCoin extends Coin
{
	private int value;
	
	public MonetaryCoin(int val) {
		value = val;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int val) {
		value = val;
	}
	
	public String toString() {
		return super.getFaceName() + ", Value = " + value;
	}

}
