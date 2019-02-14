//PP 9.5
public class StudyDriver {

	public static void main(String[] args) {
		Person sally = new Person("Sally");
	//	((Income)sally).setIncome(15000);
		System.out.println("[Person Class]\n" + sally);
		
		Age a = new Age("Sally", 42);
		System.out.println("[Age Class]\n" + a);
		
		Income b = new Income("Sally", 25000);
		System.out.println("[Income Class]\n" + b);
		
		Ethnicity c = new Ethnicity("Sally", "Columbian");
		System.out.println("[Ethnicity Class]\n" + c);
	}

}
