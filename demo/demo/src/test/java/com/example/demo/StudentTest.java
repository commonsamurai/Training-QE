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
		s1 =new Student("varun","qeq","2eq2e");
	}
	
	
	@AfterEach
	public void after() {
		s1 =null;
	}
	
	
	@Test
	void testGetName() {
		assertEquals("abc", s1.getName());
	}


	@Test
	void testGetage() {
		assertEquals(200, s1.getAge());
	}
	
	@Test
	void testGetSalary() {
		assertEquals(1,s1.getSalary());
	}
	
	
	@Test
	void testSetName() {
		s1.setName("xyz");
		assertEquals("xyz", s1.getName());
	}



	@Test
	void testSetAge() {
		s1.setAge("123");
		assertEquals("12", s1.getAge());
	}
	
	@Test
	void testsetSalary() {
		s1.setSalary("123");
		assertEquals("12345",s1.getSalary());
	}


}





