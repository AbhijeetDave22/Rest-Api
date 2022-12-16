package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.pojos.Student;
@Service
public class StudentServiceImpl implements IStudentService{
     @Autowired
	private StudentDao studentDao;
	
	@Override
	public List<Student> getStudents() {
		return studentDao.findAll();
	}

	@Override
	public Student getStudent(long studentId) {
		return studentDao.getById(studentId);
	}

	@Override
	public Student addStudent(Student student) {
	    studentDao.save(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		studentDao.save(student);
		return student;
	}

	@Override
	public void deleteStudent(long studentId) {
		Student s =studentDao.getOne(studentId);
		studentDao.delete(s);
		
	}

}
