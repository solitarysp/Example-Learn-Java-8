package com.higgsup.date;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Compare {
    public static void main(String[] args) {
        soSanh();

        checkNgayTheoParam();

    }

    private static void soSanh() {
        LocalDate localDate1 = LocalDate.of(1998, 7, 20);

        LocalDate localDate2 = LocalDate.of(1999, 8, 21);

        LocalDate localDate3 = LocalDate.of(2000, 9, 22);

        LocalDate localDate4 = LocalDate.of(2000, 9, 22);

        //so sánh lớn hơn
        System.out.println(localDate3.isAfter(localDate2));

        //so sánh nhỏ hơn
        System.out.println(localDate3.isBefore(localDate2));


        //so sánh bằng hơn
        System.out.println(localDate3.compareTo(localDate4));


        // so sánh năm tháng
        YearMonth yearMonth = YearMonth.of(2018, 9);
        YearMonth yearMonth2 = YearMonth.of(2018, 1);
        YearMonth yearMonth3 = YearMonth.parse("2018-09", DateTimeFormatter.ofPattern("yyyy-MM"));
        System.out.println("yearMonth3: " + yearMonth3);
        System.out.println(yearMonth.isAfter(yearMonth2));
    }

    private static void checkNgayTheoParam() {
        //check ngày có phải ngày theo param không

        MonthDay currentMonthDay = MonthDay.from(LocalDate.now());
        MonthDay ngay = MonthDay.of(9, 29);

        if (currentMonthDay.equals(ngay))
            System.out.println("đúng");
        else
            System.out.println("sai");
    }
}
