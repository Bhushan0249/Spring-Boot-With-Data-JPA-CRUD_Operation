package com.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.main.Services.StudentService;
import com.main.Services.StudentServiceImple;
import com.main.entities.Student;

@SpringBootApplication
public class SpringBootProjectWithDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootProjectWithDataJpa1Application.class,
				args);

		StudentService stdSer = context.getBean(StudentServiceImple.class);

//-------------------INSERTION OPERATION--------------		
		Student std = new Student();
        std.setId(2L);
		std.setName("vaibhav");
		std.setRollNo(502);
		std.setMarks(97.90f);

		boolean bhu = stdSer.addStudentDetails(std);

		if (bhu) {
			System.out.println("Data Inserted Successfully....");
		} else {
			System.out.println("Data NOT Inserted due to some error....");
		}

//----------------VIEW ALL OPERATION1----------------------

//		List<Student> list = stdSer.getAllstdDetails();
//
//		for (Student std : list) {
//
//			System.out.println("id: " + std.getId());
//			System.out.println("name: " + std.getName());
//			System.out.println("roll Number: " + std.getRollNo());
//			System.out.println("marks: " + std.getMarks());
//			System.out.println("----------------------------------------");
//}

//----------------VIEW ONE BY ID ----------------------

//		Student std = stdSer.getStdDetails(101L);
//
//		if (std != null) {
//			System.out.println("id: " + std.getId());
//			System.out.println("name: " + std.getName());
//			System.out.println("roll Number: " + std.getRollNo());
//			System.out.println("marks: " + std.getMarks());
//		} else {
//			System.out.println("Data NOT Found in this ID");
//		}

//---------------UPDATION OPERATION--------------------------
//
//		boolean bhu = stdSer.UpdateStd(1L, 98.55f);
//
//		if (bhu) {
//			System.out.println("Data Updated Successfully.....");
//		} else {
//			System.out.println("Data NOT Updated deu to some error");
//		}

//-------------DELETE OPERATION----------------

//		boolean bhu = stdSer.deleteStdDetails(2L);
//
//		if (bhu) {
//			System.out.println("Data Deleted Successfully.....");
//		} else {
//			System.out.println("Data NOT Deleted due to some error ");
//		}

	}

}
