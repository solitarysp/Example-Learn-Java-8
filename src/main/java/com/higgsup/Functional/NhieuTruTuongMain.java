package com.higgsup.Functional;

import com.higgsup.Functional.entity.Student;

public class NhieuTruTuongMain {

    public static void main(String[] args) throws Exception {
        Student student = new Student();

        NhieuTruuTuong nhieuTruuTuong = s -> s;
        nhieuTruuTuong.get("D");
        System.out.println(student.getId());
    }
}
