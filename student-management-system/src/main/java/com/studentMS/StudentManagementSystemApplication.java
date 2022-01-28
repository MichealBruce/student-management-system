package com.studentMS;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

//import com.entity.Student;
//import com.respository.StudentRepository;

@SpringBootApplication
//@ComponentScan("com")
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
//	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
//		Student student1= new Student("Micheal", "Anish", "michealanish06@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2= new Student("feroz","mich","ferozani43@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3= new Student("bruce","lee","bruceani43@gmail.com");
//		studentRepository.save(student3);
		
				
	}
	
	
	
	

}
