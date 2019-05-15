package com.atul.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.atul.dao.StudentDao;
import com.atul.entity.Student;

@Service
public class StudentService {
	
	@Value("${dao.student}")
	private String studentDaoVal;
	
	@Autowired
	@Qualifier("Fake")
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents(){
		System.out.println(studentDaoVal);
		return studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}
	
	public void removeById(int id) {
		studentDao.removeById(id);
	}
	
	public void createStudent(Student student) {
		studentDao.createStudent(student);
	}

	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}


}
