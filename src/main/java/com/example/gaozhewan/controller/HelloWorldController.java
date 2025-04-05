package com.example.gaozhewan.controller;

import com.example.gaozhewan.mapper.StudentMapper;
import com.example.gaozhewan.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    // 恢复分页查询接口，分别调用分页查询和总记录数查询
    @GetMapping("/students/page")
    public Map<String, Object> getStudentsByPage(@RequestParam int pageSize, @RequestParam int pageIndex) {
        List<Student> students = studentMapper.findStudentsByPage(pageSize, pageSize * (pageIndex - 1));
        int totalCount = studentMapper.getTotalCount();
        Map<String, Object> result = new HashMap<>();
        result.put("totalCount", totalCount);
        result.put("students", students);
        return result;
    }
}