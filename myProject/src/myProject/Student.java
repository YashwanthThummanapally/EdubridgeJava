package myProject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private int studentId;
	private String studentName;
	private String courseName;
	private double courseFee;
}
