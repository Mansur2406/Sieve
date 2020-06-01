package com.lg.jdbc.ui;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.*;

public class Dateexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LocalDate now=LocalDate.now();
      LocalDate independence=LocalDate.of(1947, Month.AUGUST, 15);
      System.out.println("Independence:"+independence);
      System.out.println("today:"+now);
      System.out.println("tomorrow:"+now.plusDays(1));
      System.out.println("last month:"+now.minusMonths(1));
      System.out.println("is leap:"+now.isLeapYear());
      System.out.println("move to 30th day of month:"+now.withDayOfMonth(30));
      
      System.out.println("=======================================================");
      System.out.println("plus days="+now.plusDays(20));
      System.out.println("plus months="+now.plusMonths(5));
      System.out.println("plus years="+now.plusYears(2));
      
      System.out.println("===========================================================");
      System.out.println("minus days="+now.minusDays(23));
      System.out.println("minus months="+now.minusMonths(5));
      System.out.println("minus years="+now.minusYears(2));
      
      System.out.println("===========================================================");
      System.out.println("get year="+now.getYear());
      System.out.println("get month="+now.getMonth());
      System.out.println("get day of month="+now.getDayOfMonth());
      System.out.println("get day of yera="+now.getYear());
      
      System.out.println("============================================================");
      System.out.println("with the month="+independence.withMonth(5));
      System.out.println("with the year="+independence.withYear(1999));
      System.out.println("with the day of month="+independence.withDayOfMonth(15));
      System.out.println("with the day of year="+independence.withDayOfYear(24));
      
      System.out.println("=============================================================");
      LocalDate dob=LocalDate.of(1998, Month.JUNE,24);
      LocalDate curDate=LocalDate.now();
      //Period p=dob.until(curDate);
      Period p1=Period.between(dob,curDate);
      
      System.out.println(p1);
      
      System.out.println("days = " +p1.get(ChronoUnit.DAYS));
      System.out.println("months = "+p1.get(ChronoUnit.MONTHS));
      System.out.println("years="+p1.get(ChronoUnit.YEARS));
	}

}
