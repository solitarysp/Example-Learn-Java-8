package com.higgsup.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class TinhToanGiua2NgayThangNam {
    public static void main(String[] args) {
        ngayThangNam();
    }

    private static void ngayThangNam() {
        LocalDate date1 = LocalDate.of(2018, 1, 1);
        LocalDate date2 = LocalDate.of(2018, 8, 20);
        Period periodToNextJavaRelease = Period.between(date1, date2);
        System.out.println(periodToNextJavaRelease.getMonths());
    }
}
