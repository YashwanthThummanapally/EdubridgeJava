
public class Employee {
	// instance variables
	int employeeId;
	String employeeName;
	double salary;

	// static property
	static String employeeOrganization = "Edubridge";

	// constructor
	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	// instance method
	public void displayEmployeeDetails() {
		System.out.println("Employee ID : " + this.employeeId);
		System.out.println("Employee Name : " + this.employeeName);
		System.out.println("Salary : " + this.salary);
	}

	@Override
	public String toString() {
//		return super.toString();
		return employeeId + "\t" + employeeName + "\t" + salary;
	}
}
