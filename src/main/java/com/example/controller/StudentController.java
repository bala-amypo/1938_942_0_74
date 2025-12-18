package com.example.demo.controller;

import org.springframework.web.bind.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.student;
import com.example.demo.service.Studentservice;

@RestController
public class StudentController{
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public Student postdata(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
}