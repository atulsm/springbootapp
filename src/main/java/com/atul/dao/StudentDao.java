package com.atul.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.atul.entity.Student;

@Repository
public class StudentDao {
	
	private static Map<Integer, Student> students;
	static {
		students = new HashMap<Integer, Student>(){
			{
				put(1, new Student(1, "Atul", "Computer Sciense"));
				put(2, new Student(2, "Pai", "Computer Sciense"));
				put(3, new Student(3, "Katta", "Mechanical"));
			}
		};
	}
	
	public Collection<Student> getAllStudents(){
		return students.values();
	}

}
