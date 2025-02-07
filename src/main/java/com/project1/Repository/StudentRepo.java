package com.project1.Repository;

import org.springframework.stereotype.Repository;

import com.project1.Entity.Student;

@Repository
public interface StudentRepo {//extends JpaRepository<Student,Integer> {

	public Student findById(int id);
	
	public Student deleteById(int id);
	
	
}
