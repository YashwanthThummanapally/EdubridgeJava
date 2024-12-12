
public class DoctorTest {
	public static void main(String[] args) {
		Doctor doctor1 = new Doctor("Rajender Prasad", "Children specialist", 30, 56000.0);
		doctor1.displayDoctorDetails();
		
		System.out.println("----------");
		
		Doctor doctor2 = new Doctor("Kali Prasad", "Homeopathy", 20, 34900.0);
		doctor2.displayDoctorDetails();
	}
}
