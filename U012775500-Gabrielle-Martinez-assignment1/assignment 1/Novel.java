//PP 9.3
public class Novel extends ReadingMaterial
{
	private String protagonist;
	
	public Novel(String name, String author, String synopsis, int pages, String protag) {
		super(name, author, synopsis, pages);
		protagonist = protag;
	}
	
	public String spoilers() {
		return "Warning! There be Spoilers ahead!\n" + protagonist + " dies at the end";
	}
	
}
