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

}
