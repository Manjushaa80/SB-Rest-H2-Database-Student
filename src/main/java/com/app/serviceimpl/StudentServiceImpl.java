package com.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRepository;
import com.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	private StudentRepository repository;

	@Autowired
	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}

	public Student saveStudent(Student student) {
		return repository.save(student);
		
	}

	public Student getStudent(int id) {
		 Optional<Student> optional = repository.findById(id);
		 if(optional.isPresent())
		 {
			 return optional.get();
		 }
		return null;
	}

	public List<Student> getAllStudent() {
		List<Student> list = repository.findAll();
		return list;
	}
	public Student deleteStudent(int id) {
		      repository.deleteById(id);
		    
		return getStudent(id);
	}

}
