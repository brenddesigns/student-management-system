package com.brendzn.sms;

import com.brendzn.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Brendan", "Langenhoff", "brendanlangenhoff@icloud.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Matthew", "Takau", "matthewtakau@hotmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Josh", "Beckham", "josh.beck@gmail.com");
//		studentRepository.save(student3);
	}
}
