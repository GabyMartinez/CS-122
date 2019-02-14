//PP 9.3
public class ReadingMaterial {
	protected String title, author, synopsis;
	protected int pages;
	
	public ReadingMaterial(String title, String author, String summary, int pageNum) {
		this.title = title;
		this.author = author;
		pages = pageNum;
		synopsis = summary;
	}
	
	public String toString() {
		return title + ", " + author +", " + pages + "pgs\nSynopsis: " + synopsis;
	}
}
