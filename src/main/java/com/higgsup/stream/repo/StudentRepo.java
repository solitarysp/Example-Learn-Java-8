package com.higgsup.stream.repo;

import com.higgsup.stream.entity.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentRepo {
    static List<Student> students = new ArrayList<>();

    public List<Student> getListStudent() {
        if(students.size()==0){
            List<Student> students = new ArrayList<>();
            for (int i = 0; i < 9876; i++) {
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
