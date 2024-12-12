package com.edubride.elite.service;

import com.edubride.elite.model.Student; // Student cannot be resolved to a type

public class StudentService {
	public static void main(String[] args) {
		Student student = new Student(1001, "Wills", 9898989090L, "wills@gmail.com");
		System.out.println(student);
	}
}
