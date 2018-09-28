package com.higgsup.CollectionTest.repo;

import com.higgsup.CollectionTest.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
    static List<Student> students = new ArrayList<>();

    public List<Student> getListStudent(Integer values) {
        if(students.size()==0){
            List<Student> students = new ArrayList<>();
            for (int i = 0; i < values; i++) {
                Student student = new Student();
                student.setId(i);
                student.setName("name: " + i);
                students.add(student);
            }
            return students;
        }else {
            return students;
        }
    }
}
