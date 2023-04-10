package com.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pr.model.student;
import com.pr.service.StudentService;

@Controller
public class studentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public String allStudent(Model model) {
		 List<student> students = studentService.getAllStudent();
		model.addAttribute("students", students);
		return "student";
	}
	
	@GetMapping("/students/add")
	public String addNewStudentHandler(Model model) {
		student student =new student();
		 model.addAttribute("student", student);
		 return "studentAdd";
	}
	
	@PostMapping("/students")
	public String postStudent(@ModelAttribute("student" ) student studes ) { 
		studentService.addNewStudent(studes);
		return "redirect:/student";
	}
	

	@GetMapping("/students/update/{id}")
	public String updateStudent(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "updatestudent";
	}
	@PostMapping("/students/{id}")
	public String updateStudents(@PathVariable("id") Integer id, @ModelAttribute("student") student student, Model model) {
		 student isPresent=studentService.getStudentById(id);
		 isPresent.setName(student.getName());
		 isPresent.setMarks(student.getMarks());
		 isPresent.setRollNumber(student.getRollNumber());
		 isPresent.setStandard(student.getStandard());
		 isPresent.setStudentId(id);
		 studentService.updateStudent(id, isPresent);
		 return "redirect:/student";
	}
	

	
	@GetMapping("students/delete/{id}")
	public String deleteStudent(@PathVariable ("id") Integer id) {
		studentService.deleteStudent(id);
		return "redirect:/student";
	}
	
	
	
	
	
	
}
