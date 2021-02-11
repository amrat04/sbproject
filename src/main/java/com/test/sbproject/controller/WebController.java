package com.test.sbproject.controller;

import com.test.sbproject.dto.DeleteRequest;
import com.test.sbproject.dto.LoginRequest;
import com.test.sbproject.entity.Student;
import com.test.sbproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    public class WebController {

    @Autowired
    StudentService studentService;

    @GetMapping("/hello")
    public String getResp(){
        return "hello World!";
    }

    @GetMapping("/product/{productid}/{categoryid}")
    @ResponseBody
    public String exampleWithPathVariable(@PathVariable("productid") int productId,
                                          @PathVariable("categoryid") int categoryId){
        // I will fetch the details from backend / database.
        return "Product information for product id : "+productId+" with category id "+ categoryId;
    }

    @GetMapping("/book")
    @ResponseBody       // localhost:8080/context?key1=value1&key2=value2
    public String exampleWithRequestParameters(@RequestParam("bookid") int bookId, @RequestParam("bookname") String bookName){
        return "Book ID : "+ bookId + " Bookname : "+bookName;
    }


    @PostMapping("/login")
    @ResponseBody
    public boolean login(@RequestBody LoginRequest loginRequest){

        boolean validate = studentService.login(loginRequest);
        return validate;
    }

    @PostMapping("/save")
    @ResponseBody
    public Student saveStudent(@RequestBody Student student){
        Student response = studentService.save(student);
        return  response;
    }

    @GetMapping("/student/{studentid}")
    @ResponseBody
    public Student getStudentById(@PathVariable("studentid") int studentid){
        Student student  = studentService.searchById(studentid);
        return student;
    }

    @GetMapping("/getstudents")
    @ResponseBody
    public List<Student> getStudents(){
        List<Student> students  = studentService.getStudents();
        return students;
    }

    @PutMapping("/updatestudent/")
    @ResponseBody
    public Student updateStudents(@RequestBody Student student){
        Student response = studentService.updateStudent(student);
        return response;
    }

    @DeleteMapping("/deletestudent")
    @ResponseBody
    public String deleteStudent(@RequestBody DeleteRequest deleteRequest){
        studentService.deleteStudent(deleteRequest.getId());
        return "success";
    }

    //2 types of webservices

        // 1. RESTFUL API - JSON, XML, HTML,
        // 2. SOAP Based - XML

    //Spring Boot
    //1. Application server - Apache tomcat is in build.
    //2. We get boiler plate code ready with all the configurations.



    // HTTP.GET-- this is not secured. This is used to fetch information from the database.
    // HTTP.POST --This is secured compared to GET. This is used to store/create data in database
    // PUT -- To update the data in database.
    // DELETE - To delete any entity in the database.


}
