
public class EmployeeTest {
	public static void main(String[] args) {
		// object creation or instantiation
		Employee e1 = new Employee(1001, "Wills", 45000.0);
		
		// accessing instance variables
		System.out.println(e1.employeeId);
		System.out.println(e1.employeeName);
		System.out.println(e1.salary);
		
		// accessing static property
		System.out.println(e1.employeeOrganization);
		System.out.println(Employee.employeeOrganization); // recommended
		
		e1.displayEmployeeDetails();
	}
}
