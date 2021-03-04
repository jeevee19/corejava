package com.capg.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime  date = LocalDateTime.now();
		
DateTimeFormatter  formatter =DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		

				System.out.println(date.format(formatter));
				
				
		DateTimeFormatter  myformatter =		   DateTimeFormatter.ofPattern("dd-MM-yyyy");
				
						System.out.println(date.format(myformatter));
		
					 String  str = "1947-08-15"; // yyyy-mm-dd	
					 
			LocalDate  independance =		 LocalDate.parse(str);
			
				String formattedDate =	independance.format(myformatter);
					
			System.out.println(formattedDate);
						
		
	}

}
