package com.qlchtl.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateConverter {
    public static String convertDate(String inputDate, String inputFormat, String outputFormat) {
        // Chuyển đổi chuỗi đầu vào thành LocalDate
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(inputFormat);
        LocalDate date = LocalDate.parse(inputDate, inputFormatter);

        // Chuyển đổi LocalDate thành chuỗi đầu ra
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern(outputFormat);
        return date.format(outputFormatter);
    }
}