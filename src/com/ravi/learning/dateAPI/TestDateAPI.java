package com.ravi.learning.dateAPI;

import com.ravi.learning.Day;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestDateAPI {

    public static void main(String[] args) {
        LocalDate date =LocalDate.now();
        System.out.println(" Date : "+ date);
        LocalTime time =LocalTime.now();
        System.out.println("Time : "+time);
        LocalDateTime current=LocalDateTime.now();
        System.out.println("local date and time is :"+ current);

        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        String dateformattime=current.format(format);
        System.out.println("using date time formater "+dateformattime);
        Month month=current.getMonth();
        int day=current.getDayOfMonth();
        int seconds=current.getSecond();
        System.out.println("month : "+ month + " days : "+day + " seconds : "+ seconds);


    }
}
