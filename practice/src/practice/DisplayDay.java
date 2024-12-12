package practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DisplayDay {
	public static void findDay(int year, int month, int day) {
		LocalDate date = LocalDate.of(year, month, day);
		DayOfWeek week = date.getDayOfWeek();
		System.out.println(week.toString());
	}
	
	public static void main(String[] args) {
		findDay(2024, 11, 28);
	}
}
