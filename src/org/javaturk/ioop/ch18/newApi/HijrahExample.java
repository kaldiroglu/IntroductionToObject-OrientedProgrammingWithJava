package org.javaturk.ioop.ch18.newApi;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class HijrahExample {

	public static void main(String[] args) {

		HijrahDate today = HijrahDate.now();
		System.out.println("Now in Hijrah: " + today);
		
		System.out.println(today.getEra());
		System.out.println("Year: " + today.get(ChronoField.YEAR));
		System.out.println("Month: " + today.get(ChronoField.MONTH_OF_YEAR));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM", Locale.ENGLISH);
		System.out.println("Month Name: " + formatter.format(today));
		System.out.println("Day of Month: " + today.get(ChronoField.DAY_OF_MONTH));
		System.out.println("Day of Week: " + today.get(ChronoField.DAY_OF_WEEK));
	}
}
