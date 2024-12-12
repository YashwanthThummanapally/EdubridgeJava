
public class Patient {
	int patientId;
	String patientName;
	String purpose;
	char gender;
	int age;

	public Patient(int patientId, String patientName, String purpose, char gender, int age) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.purpose = purpose;
		this.gender = gender;
		this.age = age;
	}

	public void displayPatientDetails() {
		System.out.println("Patient ID : " + patientId);
		System.out.println("Patient Name : " + patientName);
		System.out.println("Purpose : " + purpose);
		System.out.println("Gender : " + gender);
		System.out.println("Age : " + age);
	}
}
