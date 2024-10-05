package com.main.Services;

import java.util.List;

import com.main.entities.Student;

public interface StudentService {

	public boolean addStudentDetails(Student std);
	
	public  List<Student> getAllstdDetails(); 
	
	public Student getStdDetails(Long id);
	
	public 	boolean UpdateStd(Long id,float marks);
	
	public boolean deleteStdDetails(Long id);
	
	
}
