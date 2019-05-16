package com.atul.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.atul.model.Student;

@Repository
@Qualifier("H2")
public class StudentDaoH2Impl implements StudentDao {

	@Override
	public Collection<Student> getAllStudents() {
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		return null;
	}

	@Override
	public void removeById(int id) {

	}

	@Override
	public void createStudent(Student student) {

	}
	
	@Override
	public void updateStudent(Student updatedStudent) {
	
	}

}
