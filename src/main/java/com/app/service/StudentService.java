package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface StudentService {

	Student saveStudent(Student student);

	Student getStudent(int id);

	List<Student> getAllStudent();

	Student deleteStudent(int id);

}
