package myProject;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Wills", 55000.0, "wills@gmail.com");
		System.out.println(employee1.getEmployeeId());
		System.out.println(employee1.getEmployeeName());
		System.out.println(employee1.getEmployeeSalary());
		System.out.println(employee1.getEmployeeEmail());
		System.out.println(employee1);
		
		Employee employee2 = new Employee();
		employee2.setEmployeeId(102);
		employee2.setEmployeeName("Hari");
		employee2.setEmployeeSalary(56700.0);
		employee2.setEmployeeEmail("hari@gmail.com");
		System.out.println(employee2);
	}
}
