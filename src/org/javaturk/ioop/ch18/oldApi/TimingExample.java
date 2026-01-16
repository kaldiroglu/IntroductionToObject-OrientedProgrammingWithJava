//
//package org.javaturk.ioop.ch18.oldApi;
//
///**
// * @author akin
// *
// */
//public class TimingExample {
//	public static void main(String[] args) throws InterruptedException {
//		measurePeriod();
////		measureLag(1000);
//	}
//
//	public static void measurePeriod() {
//		long start, end;
//		int[] a = new int[1_000_000_000];
//		int[] b = new int[1_000_000_000];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = i;
//		}
//		start = System.currentTimeMillis();
//		for (int j = 0; j < a.length; j++) {
//			b[j] = a[j];
//		}
//		end = System.currentTimeMillis();
//		long time = end - start;
//		System.out.println(STR."\{time} milli seconds for copying an array using loop.");
//
//		start = System.currentTimeMillis();
//		System.arraycopy(a, 0, b, 0, b.length);
//		end = System.currentTimeMillis();
//		time = end - start;
//		System.out.println(STR."\{time} milli seconds for copying an array using System.arraycopy().");
//	}
//
//	public static void measureLag(int milisecond) throws InterruptedException{
//		System.out.println("Measured period: " + milisecond + " ms.");
//		long start = System.currentTimeMillis();
//		Thread.sleep(milisecond);
//		long end = System.currentTimeMillis();
//		System.out.println("Time period: " + (end - start) + " ms.");
//	}
//}
