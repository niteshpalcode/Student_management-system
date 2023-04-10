package com.pr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pr.model.student;
import com.pr.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public student addNewStudent(student student) {
	
		return studentRepo.save(student);
	}

	@Override
	public String deleteStudent(Integer studentId) {
	String message="Deleted";
		Optional<student> optional=studentRepo.findById(studentId);
		if(optional.isPresent()) {
			studentRepo.delete(optional.get());
		}
		else {
			message="Student Id is not found";
		}
		return message;
	}

	@Override
	public student updateStudent(Integer studentId, student student) {
		Optional<student> optional=studentRepo.findById(studentId);
		if(optional.isPresent()) {
			student studentUpdate=optional.get(); 
			studentUpdate.setMarks(student.getMarks());
			studentUpdate.setName(student.getName());
			studentUpdate.setRollNumber(student.getRollNumber());
			studentUpdate.setStandard(student.getStandard());
			studentRepo.save(studentUpdate);
			
		}
		return student;
	}

	@Override
	public student getStudentById(Integer studentId) {
		Optional<student> optional=studentRepo.findById(studentId);
		student student=null;
		if(optional.isPresent()) {
			student=optional.get();	
		}
		return student;
	}


	@Override
	public List<student> getAllStudent() {
	List<student> allStudent=studentRepo.findAll();
	return allStudent;
	}
	
	
}
