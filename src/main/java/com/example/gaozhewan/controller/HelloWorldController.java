package com.example.gaozhewan.controller;

import com.example.gaozhewan.mapper.StudentMapper;
import com.example.gaozhewan.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentMapper.findAllStudents();
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        studentMapper.insertStudent(student);
    }
}