package com.lg.jdbc.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.*;

public class DateTimeFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
       LocalDate currentDate=LocalDate.now();
       System.out.println(currentDate.format(formatter));
       
     /*  DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("dd/MM//yyyy");
       String text="12/02/2015";
       LocalDate date=LocalDate.parse(text,formatter1);
       System.out.println(date);*/
	}

}
