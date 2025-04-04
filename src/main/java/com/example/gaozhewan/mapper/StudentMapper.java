package com.example.gaozhewan.mapper;

import com.example.gaozhewan.model.Student;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> findAllStudents();
    void insertStudent(Student student); // 新增方法
}