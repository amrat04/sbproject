package com.test.sbproject.service;

import com.test.sbproject.dto.LoginRequest;
import com.test.sbproject.entity.Student;
import com.test.sbproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public boolean login(LoginRequest loginRequest) {   // our business logic will always reside in this.
        Student student = studentRepository.findByUsernameAndPassword(loginRequest.getUsername(),
                loginRequest.getPassword());
        if(student == null){
            return false;
        }

        return true;
    }

    @Override
    public Student save(Student student) {
        Student responseStudent = studentRepository.save(student);

        return responseStudent;
    }

    @Override
    public Student searchById(int id) {
        Optional<Student> student1 = studentRepository.findById(id);
        if(student1.isPresent()) {
            return student1.get();
        }
        return null;
    }

    @Override
    public List<Student> getStudents() {
        List<Student> list = studentRepository.findAll();
        return list;
    }

    @Override
    public Student updateStudent(Student student) {
        Optional<Student> student1 = studentRepository.findById(student.getStudentid());
        if(student1.isPresent()){
            Student s = studentRepository.save(student);
            return s;
        } else {
            return student;
        }

    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

}
