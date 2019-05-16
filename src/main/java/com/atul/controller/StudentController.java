package com.atul.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atul.model.Student;
import com.atul.service.StudentService;

@RestController
@RequestMapping(path = "/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public Collection<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping(path = "/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteStudentById(@PathVariable("id") int id) {
		studentService.removeById(id);
	}
	
	@PostMapping()
	public void createStudent(@RequestBody Student student) {
		studentService.createStudent(student);
	}
	
	@PutMapping
	public void updateStudent(@RequestBody Student student) {
		studentService.updateStudent(student);
	}
	
}
