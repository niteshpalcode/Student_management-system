package com.pr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pr.model.student;

@Service
public interface StudentService {

	public student addNewStudent(student student);
	public String deleteStudent(Integer studentId);
	public student updateStudent(Integer studentId,student student);
	public student getStudentById(Integer studentId);
	public List<student> getAllStudent();
	
}
