package com.higgsup.stream.stream_Va_parallelStream;

import com.higgsup.stream.entity.Student;
import com.higgsup.stream.repo.StudentRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream {
    static StudentRepo studentRepo = new StudentRepo();

    public static void main(String[] args) {
        List<Student> students = studentRepo.getListStudent();
        List<String> strings = new ArrayList<>();
        Long start = System.currentTimeMillis();
        students.parallelStream().filter(student -> {

            return true;
        }).collect(Collectors.toList());
        System.out.println(System.currentTimeMillis()-start);
    }
}
