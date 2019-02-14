//PP 9.3
public class ReadingDriver {
	public static void main(String[] args) {
		
		ReadingMaterial a = new ReadingMaterial("Quiet", "Susan Collins", "An Introvert Guide", 57);
		System.out.println(a);
		
		Novel b = new Novel("Ink and Steel", "Billy Shakes", "Alternate history of Elizabethian Era", 406, "Marlowe");
		System.out.println(b);
		System.out.println(b.spoilers());
	}
}
