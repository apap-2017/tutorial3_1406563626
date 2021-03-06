package com.example.tutorial3.service;

/**
 * Created by hasyapasaribu on 9/23/17.
 */

import java.util.ArrayList;
import java.util.List;
import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
    private static List<StudentModel> studentList = new ArrayList<StudentModel>();

    @Override
    public StudentModel selectStudent(String npm) {
        for (StudentModel student: studentList){
            if(student.getNpm().equals(npm)){
                return student;
            }
        }
        return null;
    }

    @Override
    public List<StudentModel> selectAllStudents() {
        return studentList;
    }

    @Override
    public void addStudent(StudentModel student){
        studentList.add(student);
    }

    @Override
    public void deleteStudent(String npm){
        int index = 0;
        for (StudentModel student: studentList){
            if(student.getNpm().equals(npm)){
                studentList.remove(index);
                break;
            }
        }
    }
}
