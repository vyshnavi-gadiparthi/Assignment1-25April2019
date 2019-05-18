import java.time.*;
import java.util.*;

import java.time.*;
import java.util.*;
import java.io.*;

public class DurationBetweenDates {  
   public static void main(String[] args)
    {
		
		String date;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date of format (yyyy-mm-dd): ");
		date = sc.nextLine();

		LocalDate newDate = LocalDate.parse(date);
    	
        
 		//LocalDate date = LocalDate.parse(newDate, sysDate);
 		LocalDate now = LocalDate.now();
        Period diff = Period.between(newDate, now);
 
        System.out.printf("\nDifference is %d years, %d months and %d days \n\n",  diff.getYears(), diff.getMonths(), diff.getDays());
  		
    }
}

