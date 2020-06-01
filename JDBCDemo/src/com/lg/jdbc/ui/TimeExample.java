package com.lg.jdbc.ui;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ZonedDateTime currentTime =ZonedDateTime.now();
       ZonedDateTime currentTimeInParis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
       System.out.println("india:"+currentTime);
       System.out.println("paris:"+currentTimeInParis);
	}

}
