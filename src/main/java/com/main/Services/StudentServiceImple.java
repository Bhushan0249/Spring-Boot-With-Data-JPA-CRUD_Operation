package com.main.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.Reposetry.StudentReposetry;
import com.main.entities.Student;

@Service
public class StudentServiceImple implements StudentService {

	@Autowired
	private StudentReposetry studentRepo;

	@Override
	public boolean addStudentDetails(Student std) {
		boolean status = false;

		try {
			studentRepo.save(std);
			status = true;

		} catch (Exception e) {
			e.getStackTrace();
			status = false;
		}
		return status;
	}

	@Override
	public List<Student> getAllstdDetails() {

		return studentRepo.findAll();
	}

	@Override
	public Student getStdDetails(Long id) {

		Optional<Student> optional = studentRepo.findById(id);

		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}

	}

	@Override
	public boolean UpdateStd(Long id, float marks) {

		Student std = getStdDetails(id);
		if (std != null) {
			std.setMarks(marks);
			studentRepo.save(std);
			return true;
		} else {

			return false;
		}

	}

	@Override
	public boolean deleteStdDetails(Long id) {

		boolean status = false;
		try {

			studentRepo.deleteById(id);
			status = true;

		} catch (Exception e) {
			e.getStackTrace();
			status = false;
		}
		return status;
	}

}
