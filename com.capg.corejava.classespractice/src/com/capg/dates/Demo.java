package com.capg.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalUnit;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(Instant.now());	
		System.out.println(LocalDateTime.now());

		LocalDate currentDate = LocalDate.now();
		
		LocalDate  previousDate =			LocalDate.of(1947,8,15);

		System.out.println(currentDate);
		System.out.println(previousDate);
		
			System.out.println(currentDate.getYear());
			
			System.out.println(currentDate.getMonth() +"  "+currentDate.getMonthValue());
			
			System.out.println(currentDate.getDayOfYear());
			
			System.out.println(currentDate.plusMonths(6));
			
			System.out.println(currentDate.minusYears(2));
			
			System.out.println(currentDate.isLeapYear());
			
			System.out.println(currentDate.isAfter(previousDate));
			
			System.out.println(currentDate.isBefore(previousDate));
			
			System.out.println(previousDate.withMonth(3));
			
			Period period =Period.between(previousDate, currentDate);		
			
			
			System.out.println(period.getMonths());
			
			
			
	Duration dur =	Duration.between(LocalDateTime.now(), LocalDateTime.now().minusYears(5));
				
				System.out.println(dur);
		

	}

}
