package AssLocaldates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class GetYearMonthDay {

	public static void main(String[] args) {
		int year = LocalDate.now().getYear();
		System.out.println("current date year: "+year);
		Month month = LocalDate.now().getMonth();
        System.out.println("current date year: "+month);
        DayOfWeek day = LocalDate.now().getDayOfWeek();
        System.out.println("current date year: "+day);
        
        int dayofyear = LocalDate.now().getDayOfYear();
        System.out.println("day in a year"+dayofyear);
        
        }

}
