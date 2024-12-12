import java.util.Scanner;

public class ProgressReport {
	
	static int[] marks;
	
	static {
		marks = new int[6];
	}

	public static String findGrade(int marks) {
		String grade = null;
		if (marks >= 91 && marks <= 100) {
			grade = "A1";
		} else if (marks >= 81 && marks < 91) {
			grade = "A2";
		} else if (marks >= 71 && marks < 81) {
			grade = "B1";
		} else if (marks >= 61 && marks < 71) {
			grade = "B2";
		} else if (marks >= 51 && marks < 61) {
			grade = "C1";
		} else if (marks >= 41 && marks < 51) {
			grade = "C2";
		} else if (marks >= 35 && marks < 41) {
			grade = "D";
		} else if (marks >= 0 && marks < 35) {
			grade = "E";
		} else {
			grade = "";
		}
		return grade;
	}

	public static int findGradePoint(int marks) {
		int point = 0;
		if (marks >= 91 && marks <= 100) {
			point = 10;
		} else if (marks >= 81 && marks < 91) {
			point = 9;
		} else if (marks >= 71 && marks < 81) {
			point = 8;
		} else if (marks >= 61 && marks < 71) {
			point = 7;
		} else if (marks >= 51 && marks < 61) {
			point = 6;
		} else if (marks >= 41 && marks < 51) {
			point = 5;
		} else if (marks >= 35 && marks < 41) {
			point = 4;
		} else {
			point = 0;
		}
		return point;
	}

	public static float findCGPA() {
		return (findGradePoint(marks[0]) + findGradePoint(marks[1]) + findGradePoint(marks[2]) + findGradePoint(marks[3])
				+ findGradePoint(marks[4]) + findGradePoint(marks[5])) / 6.0f;
	}

	public static String findFinalResult() {
		String result = null;
		if (marks[0] > 34 && marks[1] > 34 && marks[2] > 34 && marks[3] > 34 && marks[4] > 34 && marks[5] > 34) {
			result = "PASSED";
		} else {
			result = "FAILED";
		}
		return result;
	}

	public static void main(String[] args) {
		// input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Roll Number :");
		int rollNumber = in.nextInt();
		System.out.println("Enter Candidate's Name :");
		String studentName = in.next();
		System.out.println("Enter Father's Name :");
		String fatherName = in.next();
		System.out.println("Enter Mother's Name :");
		String motherName = in.next();
		System.out.println("Enter School Name :");
		String schoolName = in.next();
		System.out.println("Enter Date Of Birth :");
		String dob = in.next();
		System.out.println("Enter Telugu Marks :");
		marks[0] = in.nextInt();
		System.out.println("Enter Hindi Marks :");
		marks[1] = in.nextInt();
		System.out.println("Enter English Marks :");
		marks[2] = in.nextInt();
		System.out.println("Enter Maths Marks :");
		marks[3] = in.nextInt();
		System.out.println("Enter Science Marks :");
		marks[4] = in.nextInt();
		System.out.println("Enter Social Marks :");
		marks[5] = in.nextInt();

		// Progress Report
		System.out.println("*************BOARD OF SECONDARY EDUCATION*************");
		System.out.println("ROLL NUMBER\t: " + rollNumber);
		System.out.println("CANDIDATE'S NAME : " + studentName);
		System.out.println("FATHER'S NAME\t: " + fatherName);
		System.out.println("MOTHER'S NAME\t: " + motherName);
		System.out.println("SCHOOL NAME\t: " + schoolName);
		System.out.println("DATE OF BIRTH\t: " + dob);

		System.out.println("CIRCULAR SUBJECT\tGRADE\tGRADE POINT");
		System.out.println("TELUGU\t\t" + findGrade(marks[0]) + "\t" + findGradePoint(marks[0]));
		System.out.println("HINDI\t\t" + findGrade(marks[1]) + "\t" + findGradePoint(marks[1]));
		System.out.println("ENGLISH\t\t" + findGrade(marks[2]) + "\t" + findGradePoint(marks[2]));
		System.out.println("MATHS\t\t" + findGrade(marks[3]) + "\t" + findGradePoint(marks[3]));
		System.out.println("SCIENCE\t\t" + findGrade(marks[4]) + "\t" + findGradePoint(marks[4]));
		System.out.println("SOCIAL\t\t" + findGrade(marks[5]) + "\t" + findGradePoint(marks[5]));

		float cgpa = findCGPA();

		System.out.println("CUMULATIVE GRADE POINT AVERAGE (CGPA) :\t" + String.format("%.2f", cgpa) + "\t"
				+ findFinalResult());
		
		in.close();
	}
}