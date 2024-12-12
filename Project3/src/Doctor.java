
public class Doctor {
	String doctorName;
	String specialization;
	int experience;
	double salary;
	
	public Doctor(String doctorName, String specialization, int experience, double salary) {
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.experience = experience;
		this.salary = salary;
	}
	
	public void displayDoctorDetails() {
		System.out.println("Doctor Name : "+doctorName);
		System.out.println("Specialization : "+specialization);
		System.out.println("Experience in the field : "+experience);
		System.out.println("Salary : "+salary);
	}
}
