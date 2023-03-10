package com.student.service;

import java.util.List;

import com.student.pojos.Student;

public interface IStudentService {

	public List<Student> getStudents();
	
	public Student getStudent(long studentId);
	
	public Student addStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public void deleteStudent(long studentId);
	
}
