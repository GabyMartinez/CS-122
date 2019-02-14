//PP 10.3
public class SpeakerDriver {
	public static void main(String[]arg) {
		Philosopher descartes = new Philosopher();
		Speaker prince = new Dog();
		
		descartes.speak();
		descartes.announce("Translation: I code therefore I am\n");
		
		prince.speak();
		prince.announce("u/PrinceOfGotham: I do not say woof you plebeian\n");
		
		Politician bush = new Politician();
		bush.speak();
		bush.announce("[insert platitudes]");
		
	//	prince = descartes;
	//	prince.speak();
		
	}
}
