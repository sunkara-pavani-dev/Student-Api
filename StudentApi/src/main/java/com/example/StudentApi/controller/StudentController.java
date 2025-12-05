package com.example.StudentApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentApi.model.Student;
import com.example.StudentApi.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired 
	private StudentService service;
	
	@PostMapping("/addstudent")
	public String addStudent(@RequestBody Student s) 
	{
		return service.addStudent(s);
	}
	
	
	@GetMapping("/getallstudents")
	public List <Student> getStudent()
	{
		return service.getAllStudent();
	}
	
	@PutMapping("/updatestudent/{id}")
	public Student UpdateStudent(@PathVariable int id ,@RequestBody Student s)
	{
		return service.updateStudent(id, s);
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public String deletestudent(@PathVariable int id) 
	{
		return service.deleteStudent(id);
		
	}
}










