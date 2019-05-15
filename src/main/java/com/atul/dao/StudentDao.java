package com.atul.dao;

import java.util.Collection;

import com.atul.entity.Student;

public interface StudentDao {

	Collection<Student> getAllStudents();

	Student getStudentById(int id);

	void removeById(int id);

	void createStudent(Student student);
	
	void updateStudent(Student student);

}