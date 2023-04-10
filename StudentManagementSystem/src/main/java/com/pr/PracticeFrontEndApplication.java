package com.pr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pr.model.student;
import com.pr.repository.StudentRepo;

@SpringBootApplication
public class PracticeFrontEndApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PracticeFrontEndApplication.class, args);
		System.out.println("FRONTEND RUNNING");
		
		
	}
@Autowired
StudentRepo studentRepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//	
	}

}
