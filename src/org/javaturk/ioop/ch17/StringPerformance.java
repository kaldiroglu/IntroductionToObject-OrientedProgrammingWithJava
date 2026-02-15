
package org.javaturk.ioop.ch17;

import java.util.Scanner;

/*
 * MacBookPro M1 & JDK 17
 * Method               100,000		1,000,000	   10,000,000
 * --------------------------------------------------------------
 * String with +		15692
 * StringBuilder		   17			56			   410
 * StringBuffer			   17			71		       601
 *
 * MacBookPro M1 & JDK 21
 * Method               100,000		1,000,000	   10,000,000
 * --------------------------------------------------------------
 * String with +		 1306       124981
 * StringBuilder		    3			15			   183
 * StringBuffer			    2			16		       129
 ******************************************************************
 *
 * MacBookPro M3 & JDK 21
 * Method               100,000		1,000,000	   10,000,000
 * --------------------------------------------------------------
 * String with +		  778        73170
 * StringBuilder		    3			10			   120
 * StringBuffer			    2			11		        92
 */
public class StringPerformance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of repeats: ");
		// 100_000 is a good indicator and 1_000_000 takes more time.
		int n = sc.nextInt();

		buildStringWithStringBuilder("Java", n);
		buildStringWithStringBuffer("Java",  n);
		buildStringWithPlus("Java", n);
	}

	public static void buildStringWithPlus(String string, int count) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			string = string + i;
		}
		long end = System.currentTimeMillis();
		System.out.println("buildStringWithPlus: Time to build string is " + (end - start) + " ms.");
		System.out.println("String length: " + string.length());
	}

	public static void buildStringWithStringBuilder(String string, int count) {
		StringBuilder sb = new StringBuilder(string);
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			sb.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("buildStringWithStringBuilder: Time to build string is " + (end - start) + " ms.");
		System.out.println("String length: " + sb.toString().length());
	}

	public static void buildStringWithStringBuffer(String string, int count) {
		StringBuffer sb = new StringBuffer(string);
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			sb.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("buildStringWithStringBuffer: Time to build string is " + (end - start) + " ms.");
		System.out.println("String length: " + sb.toString().length());
	}
}
