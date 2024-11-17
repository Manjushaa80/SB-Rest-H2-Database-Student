package com.app.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.StudentService;

@RestController
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	@PostMapping(value = "/addStudent")
	public ResponseEntity<Student>addStudent(@RequestBody Student student)
	{
		Student stu =service.saveStudent(student);
		return new ResponseEntity<Student>(stu,HttpStatus.CREATED);
	}
	@GetMapping(value = "/getStudent/{id}")
	public Student getStudent(@PathVariable int id)
	{
		Student student =service.getStudent(id);
		return student;
		
	}
	@GetMapping(value = "/getAllStudent")
	public List<Student> getAllStudent()
	{
		List<Student> slist=service.getAllStudent();
		return slist;
		
	}
	@DeleteMapping(value = "/deleteStudent/{id}")
	public Student deleteStudent(@PathVariable int id)
	{
		   
		Student student=service.deleteStudent(id);
		return student;
		
	}

}
