package org.javaturk.ioop.ch10.sameName;

//import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		Date date = new Date(); // Refers to the class in the same package
		System.out.println(date.name);

		java.util.Date javaDate = new java.util.Date();
		System.out.println(javaDate);
		
		java.sql.Date sqlDate = new java.sql.Date(0);
		System.out.println(sqlDate);
	}
}
