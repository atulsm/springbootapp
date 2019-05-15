package com.atul.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atul.entity.Student;
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


}
