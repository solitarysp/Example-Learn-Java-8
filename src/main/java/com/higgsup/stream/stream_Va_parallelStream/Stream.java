package com.higgsup.stream.stream_Va_parallelStream;

import com.higgsup.stream.entity.Student;
import com.higgsup.stream.repo.StudentRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    static StudentRepo studentRepo = new StudentRepo();

    public static void main(String[] args) {
        List<Student> students = studentRepo.getListStudent();
        List<String> strings = new ArrayList<>();
        Long start = System.currentTimeMillis();
        students.stream().parallel().filter(student -> {
            String thread = Thread.currentThread().toString();
            if (!strings.contains(thread)) {
                System.out.println(thread);
                strings.add(thread);
            }
            return true;
        }).collect(Collectors.toList());
        System.out.println(System.currentTimeMillis()-start);

    }
}
