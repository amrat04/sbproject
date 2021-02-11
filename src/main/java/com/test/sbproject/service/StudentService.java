package com.test.sbproject.service;

import com.test.sbproject.dto.LoginRequest;
import com.test.sbproject.entity.Student;


import java.util.List;

public interface StudentService {

    boolean login(LoginRequest loginRequest);

    Student save(Student student);

    Student searchById(int id);

    List<Student> getStudents();

    Student updateStudent(Student student);

    void deleteStudent(int id);
}
