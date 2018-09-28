package com.higgsup.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTimeTest = LocalDateTime.of(1998, 3, 9, 10, 11);


        themNgayThangNamGioPhut(localDateTime);


        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm")));
        ;

        System.out.println(" đa số giống LocalDateTest, thêm 1 số tương tự cho time");
    }


    private static void themNgayThangNamGioPhut(LocalDateTime localDateTime) {
        // muốn trừ thì khi số âm, vd : -1
        // trả về 1 LocalDate mới với số ngày/tháng/năm công thêm, data cũ k thay đổi
        System.out.println(localDateTime.plusDays(1));

        System.out.println(localDateTime.plusMonths(1));

        System.out.println(localDateTime.plusYears(1));


        // thêm 1 tuần , hay tháng, năm .v.vvv..
        System.out.println(localDateTime.plus(1, ChronoUnit.WEEKS));

        System.out.println(" với time ");
        System.out.println(" tăng giờ " + localDateTime.plusHours(1));
        System.out.println(" tăng phút " + localDateTime.plusMinutes(10));
        System.out.println(" tăng giây " + localDateTime.plusSeconds(1000));
        System.out.println(" tăng nano " + localDateTime.plusNanos(1001000));


        System.out.println(" tăng với puls " + localDateTime.plus(25, ChronoUnit.MINUTES));

        System.out.println("d");
    }
}
