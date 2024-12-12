
public class Student {
	// instance variables
	int studentId;
	String studentName;
	double cgpa;
	static String batch = "2024-192004";

	public Student(int studentId, String studentName, double cgpa) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.cgpa = cgpa;
	}

	// instance method
	public void displayStudentDetails() {
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student CGPA : " + cgpa);
		System.out.println("Batch : " + batch);
	}
}
