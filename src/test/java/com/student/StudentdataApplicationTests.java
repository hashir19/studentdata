package com.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.student.entities.Student;
import com.student.repos.StudentRepository;

@SpringBootTest
class StudentdataApplicationTests {

	@Autowired
	private StudentRepository repo;

	@Test
	void createStudent() {
		Student student=new Student();
		student.setName("Hashir");
		student.setCourse("Java Spring Boot");
		student.setFees(5000d);
		repo.save(student);

}
	@Test
	void readStudent() {
		Student student=repo.findById(2L).get();
		System.out.println(student);
		
	}
	
	@Test
	void updateStudent() {
		Student student=repo.findById(2L).get();
		student.setFees(6000d);
		repo.save(student);
	}
	
	@Test
	void deleteStudent() {
		repo.deleteById(1L);
	}

}
