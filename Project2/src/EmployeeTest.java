import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter employee id :");
		int employeeId = in.nextInt();

		System.out.println("Enter employee name :");
		String employeeName = in.next();

		System.out.println("Enter employee salary :");
		double employeeSalary = in.nextDouble();

		System.out.println("Employee Id : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee salary : " + employeeSalary);
		
		in.close();
	}
}
