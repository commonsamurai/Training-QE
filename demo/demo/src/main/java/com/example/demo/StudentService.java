package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.example.demo.Student;
import com.example.demo.StudentRepository;


@Service
public class StudentService {

	@Autowired
	private StudentRepository userRepository;
	
	public String loadbyname(String name) {
		
		
		return name;
	}
	
	
}
