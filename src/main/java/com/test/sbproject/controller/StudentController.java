package com.test.sbproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    // MVC - Model View Controller

    @RequestMapping("/test")
    public String display(ModelAndView model)
    {
        // service layer
        List<String> studentsList = new ArrayList<>();
        model.setViewName("test");
        model.addObject("studentlist",studentsList);
        return "test";
    }
    @RequestMapping("/")
    public String test(Model model)
    {
        return "index";
    }

    @RequestMapping("/hello1")
    public String helloMethod(Model model){
        return "/views/hello";
    }

    // Spring Boot.
    // Thymeleaf - This is for loading front -end pages./ UI

    //Spring
    //Jsp pages .jsp pages.




}
