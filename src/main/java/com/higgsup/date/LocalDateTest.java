package com.higgsup.date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(1998, 2, 1);

        //  layVeTimeHienTai(localDate);
        // themNgayThangNam(localDate);

        //getDuLieuVoiChronoField(localDate);

        // convertToLocalDateTime(localDate);

        //setTimeNhanh(localDate);

        // cacMethodKiemTra(localDate);

        //  methodFormat(localDate);


        layNgayTheoDiaLy();

        System.out.println("d");
    }

    private static void layNgayTheoDiaLy() {
        ZoneId vietnam = ZoneId.of("Asia/Ho_Chi_Minh");

        ZoneId hawaii = ZoneId.of("US/Hawaii");

        LocalDate nowVietNam = LocalDate.now(vietnam);
        LocalDate nowhawaii = LocalDate.now(hawaii);
    }

    private static void methodFormat(LocalDate localDate) {
        System.out.println("format :  " + localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("format :  " + localDate.format(DateTimeFormatter.ofPattern("MM-YYYY")));
        System.out.println("kiểm tra chuẩn format hiện tại :  " + localDate.getChronology().getCalendarType());
    }

    private static void cacMethodKiemTra(LocalDate localDate) {
        // kiểm tra năm nhuận
        System.out.println("năm nhuận: " + localDate.isLeapYear());
        System.out.println("check có bao nhiêu ngày tháng này " + localDate.lengthOfMonth());
        System.out.println("check có bao nhiêu ngày năm nay " + localDate.lengthOfYear());
    }

    private static void setTimeNhanh(LocalDate localDate) {
        System.out.println(localDate.withMonth(1));
        System.out.println(localDate.withYear(1990));
        System.out.println(localDate.withDayOfMonth(10));
        System.out.println(localDate.withDayOfYear(364));

        System.out.println(localDate.withYear(1998).withMonth(3).withDayOfMonth(9));
    }

    private static void convertToLocalDateTime(LocalDate localDate) {
        System.out.println(localDate.atTime(10, 20, 50));
        System.out.println(localDate.atTime(10, 20));
    }

    private static void getDuLieuVoiChronoField(LocalDate localDate) {
        System.out.println(localDate.get(ChronoField.YEAR));
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));
        System.out.println(localDate.get(ChronoField.DAY_OF_YEAR));
        System.out.println(localDate.get(ChronoField.DAY_OF_WEEK));
        System.out.println(localDate.get(ChronoField.MONTH_OF_YEAR));
    }

    private static void themNgayThangNam(LocalDate localDate) {
        // muốn trừ thì khi số âm, vd : -1
        // trả về 1 LocalDate mới với số ngày/tháng/năm công thêm, data cũ k thay đổi
        System.out.println(localDate.plusDays(1));

        System.out.println(localDate.plusMonths(1));

        System.out.println(localDate.plusYears(1));


        // thêm 1 tuần , hay tháng, năm .v.vvv..
        System.out.println(localDate.plus(1, ChronoUnit.WEEKS));

        System.out.println("d");
    }

    private static void layVeTimeHienTai(LocalDate localDate) {
        System.out.println(localDate);

        System.out.println("lấy năm : " + localDate.getYear());

        System.out.println("lấy tháng với chữ : " + localDate.getMonth());
        System.out.println("lấy tháng với số: " + localDate.getMonth().getValue());
        System.out.println("lấy tháng với số: " + localDate.getMonthValue());

        System.out.println("lấy ngày với số : " + localDate.getDayOfMonth());

        System.out.println("lấy lấy thứ của tuần này : " + localDate.getDayOfWeek());

        System.out.println("lấy đến ngày bao nhiêu của năm nay : " + localDate.getDayOfYear());
        System.out.println("");
    }
}
