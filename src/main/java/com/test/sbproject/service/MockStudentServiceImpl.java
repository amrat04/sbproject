package com.test.sbproject.service;

import com.test.sbproject.dto.LoginRequest;
import com.test.sbproject.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public class MockStudentServiceImpl implements StudentService {
    @Override
    public boolean login(LoginRequest loginRequest) {
        return false;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student searchById(int id) {
        return null;
    }

    @Override
    public List<Student> getStudents() {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudent(int id) {

    }
}
