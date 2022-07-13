package net.java.springbootwebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import net.java.springbootwebservice.model.Student;
import net.java.springbootwebservice.repository.*;


@RestController
@RequestMapping("/survey")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	
	// get all students
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
}
