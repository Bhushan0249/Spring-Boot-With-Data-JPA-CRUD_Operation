package com.main.Reposetry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entities.Student;

public interface StudentReposetry  extends JpaRepository<Student, Long>{

}
