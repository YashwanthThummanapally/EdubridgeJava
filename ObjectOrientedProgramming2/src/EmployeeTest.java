
public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmployeeId(1001);
		employee1.setEmployeeName("Yashwanth");
		employee1.setEmployeeSalary(8900.0);  
		
		Employee employee2 = new Employee().setEmployeeId(1005).setEmployeeName("Prajwal").setEmployeeSalary(67800.0);
		
		Employee employee3 = new Employee().setEmployeeId(1009).setEmployeeName("Ganesh").setEmployeeSalary(8900.0);
		
		Employee employee4 = new Employee().setEmployeeId(1010).setEmployeeName("Kishore").setEmployeeSalary(34900.0);
		
		Employee employee5 = new Employee().setEmployeeId(1018).setEmployeeName("Hari").setEmployeeSalary(56700.0);
		
		EmployeeService service = new EmployeeService();
		service.addEmployee(employee1);
		service.addEmployee(employee2);
		service.addEmployee(employee3);
		service.addEmployee(employee4);
		service.addEmployee(employee5);
		
		Employee[] employees = service.getEmployees();
//		for(Employee employee : employees) {
//			System.out.println(employee.getEmployeeId());
//			System.out.println(employee.getEmployeeName());
//			System.out.println(employee.getEmployeeSalary());
//			System.out.println("----------");
//		} // NullPointerException
		
		for(int i=0; i<service.getSize(); i++) {
			Employee employee = employees[i];
			System.out.println(employee.getEmployeeId());
			System.out.println(employee.getEmployeeName());
			System.out.println(employee.getEmployeeSalary());
			System.out.println("------------------");
		}
	}
}
