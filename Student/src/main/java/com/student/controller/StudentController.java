package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.pojos.Student;
import com.student.service.IStudentService;


@RestController
public class StudentController {

	@Autowired
	private IStudentService student ;
	@GetMapping("/Student")
	public List <Student> getStudents() 
	{
		
	return this.student.getStudents();
		 
	}
	
	@GetMapping("/Student/{studentId}")
	public Student getStudent(@PathVariable String studentId) {
		return this.student.getStudent(Long.parseLong(studentId));
	}
	
	
	@PostMapping("/Student")
	public Student addStudent(@RequestBody Student student) {
		return this.student.addStudent(student);
		
	}
	
	@PutMapping("/Student")
	public Student updateStudent(@RequestBody Student student) {
		return this.student.updateStudent(student);
	}

	@DeleteMapping("/Student/{studentId}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String studentId){
		try {
			this.student.deleteStudent(Long.parseLong(studentId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}
