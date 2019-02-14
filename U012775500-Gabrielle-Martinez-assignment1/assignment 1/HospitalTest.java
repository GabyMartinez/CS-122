//PP 9.2
public class HospitalTest {

	public static void main(String[] args) {
		Doctor a = new Doctor("Martinez");
		Nurse b = new Nurse("Chapel");
		Receptionist c = new Receptionist("Nacy");
		
		System.out.println(a + "\n" + b + "\n" + c + "\n");
		
		System.out.println(c.greet());
		System.out.println(c.callNext());
		System.out.println(b.greet());
		System.out.println(b.runTest());
		System.out.println(a.greet());
		System.out.println(a.diagnose());
	}

}
