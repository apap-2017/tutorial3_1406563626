package com.example.tutorial3.service;

/**
 * Created by hasyapasaribu on 9/23/17.
 */

import java.util.List;
import com.example.tutorial3.model.StudentModel;

public interface StudentService {
    StudentModel selectStudent(String npm);
    List<StudentModel> selectAllStudents();
    void addStudent(StudentModel student);
    void deleteStudent(String npm);
}
