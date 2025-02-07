package com.project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.project1.Entity.Student;
import com.project1.Repository.StudentRepo;

@Service
public class StudentServiceImple implements StudentInterface {

	@Autowired
	StudentRepo repo;

	public Student createStudent(Student student) {
		//repo.save(student);
		return student;
	}

	public Student getStudent(int id) {
		return repo.findById(id);
	}
	
	public Student updateStudent(Student student) {
		return student;
	}
	
	public Student deleteStudent(int id) {
		return repo.deleteById(id);
	}
}
