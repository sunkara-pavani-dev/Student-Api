package com.example.StudentApi.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentApi.model.Student;
import com.example.StudentApi.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	//logic for adding student details 
	public String addStudent(Student s)
	{
		repository.save(s);
		return "Successfully added the student details";
				
	}
	
	//logic for getting all student details
	public List <Student>  getAllStudent()
	{
		return repository.findAll();	
	}
	
	//logic for updating student details
	public Student updateStudent(int id , Student newdata)
	{
		Student old= repository.findById(id).orElse(null);
		if(old!=null) 
		{
		old.setName(newdata.getName());
		old.setAge(newdata.getAge());
		return repository.save(old);
		}
		return null;
	}
	
	//logic for deleting student by id
	public String deleteStudent(int id) {
		repository.deleteById(id);
		return "Successfully deleted student data";
	}
}







