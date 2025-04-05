package com.example.gaozhewan.mapper;

import com.example.gaozhewan.model.Student;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> findAllStudents();
    void insertStudent(Student student);
    // 恢复分页查询方法
    List<Student> findStudentsByPage(int pageSize, int offset);
    // 恢复总记录数查询方法
    int getTotalCount();
}