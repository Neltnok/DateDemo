package com.company;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {




    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");


        String  textToday = today.format(formatter);

        System.out.println(today);
        System.out.println(textToday);

        LocalDate   holdDate = today;
        holdDate = holdDate.plusDays(15);
        System.out.println("holdDate = " + holdDate);

        // create a given date
        holdDate = LocalDate.of(2019,4,15);

        Long diffDay = today.until(holdDate, ChronoUnit.DAYS);
        System.out.println("diffDay = " + diffDay);



	// write your code here
    }
}
