package com.project1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project1.Entity.Student;
import com.project1.service.StudentServiceImple;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentServiceImple service;
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student)
	{
		return service.createStudent(student);
	}
	
	
	@GetMapping("/read/{id}")
	public Student getStudent(@PathVariable int id) {
		  return service.getStudent(id);
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
		
	}
	@DeleteMapping("/delete/{id}")
	public Student deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}
}
