package com.test.sbproject.repository;

import com.test.sbproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    //@Query("select * from student s, Address a where s.status=true AND a.city='california'  ")
    Student findByUsernameAndPassword(String username, String password);

    Student findByUsername(String username);


}
