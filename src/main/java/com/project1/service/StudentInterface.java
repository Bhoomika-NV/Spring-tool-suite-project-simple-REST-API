package com.project1.service;

import com.project1.Entity.Student;

public interface StudentInterface {
	
	public Student createStudent(Student student);
	public Student getStudent(int id);
	public Student updateStudent(Student student);
	public Student deleteStudent(int id);
}
