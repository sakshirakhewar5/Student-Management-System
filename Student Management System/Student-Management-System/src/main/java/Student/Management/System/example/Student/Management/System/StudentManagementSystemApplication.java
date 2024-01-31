package Student.Management.System.example.Student.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Student.Management.System.example.Student.Management.System.Entity.Student;
import Student.Management.System.example.Student.Management.System.Repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		System.out.println("Student Mangement System Run...");
	}
	@Autowired
	private StudentRepository studentRepository;
	
	public void run(String... args) throws Exception {
		/*
		
		 Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
		 studentRepository.save(student1);
		 
		  
		*/
	}

}
