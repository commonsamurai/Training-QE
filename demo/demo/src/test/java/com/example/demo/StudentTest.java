package com.example.demo;
//package com.cognizant.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.Student;

public class StudentTest {

	
	Student s1;
	@BeforeEach
	public void before() {
		s1 =new Student("varun","2","3");
	}
	
	
	@AfterEach
	public void after() {
		s1 =null;
	}
	
	
	@Test
	void testGetName() {
		assertEquals("varun", s1.getName());
	}


	@Test
	void testGetage() {
		assertEquals("2", s1.getAge());
	}
	
	@Test
	void testGetSalary() {
		assertEquals("3",s1.getSalary());
	}
	
	
	@Test
	void testSetName() {
		s1.setName("xyz");
		assertEquals("xyz", s1.getName());
	}



	@Test
	void testSetAge() {
		s1.setAge("123");
		assertEquals("123", s1.getAge());
	}
	
	@Test
	void testsetSalary() {
		s1.setSalary("123");
		assertEquals("123",s1.getSalary());
	}


}





