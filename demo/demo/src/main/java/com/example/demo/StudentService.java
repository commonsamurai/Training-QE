package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.example.demo.Student;
import com.example.demo.StudentRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        LOGGER.info("Fetching all student");
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(String id) {
        LOGGER.info("Fetching student by ID");
        return studentRepository.findById(id);
    }

    public Student addStudent(Student student) {
        LOGGER.info("Adding a new student");
        return studentRepository.save(student);
    }

    public Student updateStudent(String id, Student updatedStudent) {
        LOGGER.info("Updating student with ID ");
        updatedStudent.setName(id);
        return studentRepository.save(updatedStudent);
    }

    public void deleteStudent(String id) {
        LOGGER.info("Deleting student");
        studentRepository.deleteById(id);
    }
}
