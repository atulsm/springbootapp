package com.atul.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.atul.model.Student;

@Repository
@Qualifier("Fake")
public class StudentDaoFakeImpl implements StudentDao {
	
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
	
	/* (non-Javadoc)
	 * @see com.atul.dao.StudentDao#getAllStudents()
	 */
	@Override
	public Collection<Student> getAllStudents(){
		return students.values();
	}
	
	/* (non-Javadoc)
	 * @see com.atul.dao.StudentDao#getStudentById(int)
	 */
	@Override
	public Student getStudentById(int id) {
		return students.get(id);
	}
	
	/* (non-Javadoc)
	 * @see com.atul.dao.StudentDao#removeById(int)
	 */
	@Override
	public void removeById(int id) {
		students.remove(id);
	}

	/* (non-Javadoc)
	 * @see com.atul.dao.StudentDao#createStudent(com.atul.entity.Student)
	 */
	@Override
	public void createStudent(Student student) {
		students.put(student.getId(), student);
	}

	@Override
	public void updateStudent(Student updatedStudent) {
		Student student = students.get(updatedStudent.getId());
		if(student != null) {
			student.setCourse(updatedStudent.getCourse());
			student.setName(updatedStudent.getName());
		}		
	}
}
