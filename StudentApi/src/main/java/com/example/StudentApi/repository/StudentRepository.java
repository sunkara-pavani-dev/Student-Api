package com.example.StudentApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentApi.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
