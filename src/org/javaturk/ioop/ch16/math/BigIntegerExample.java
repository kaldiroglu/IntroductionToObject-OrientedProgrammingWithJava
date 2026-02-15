package org.javaturk.ioop.ch16.math;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the limit:");
		int limit = in.nextInt();

		BigInteger sum = BigInteger.valueOf(0);
		for (int i = 1; i <= limit; i++) {
			sum = sum.add(BigInteger.valueOf(i));
		}

		System.out.println("Sum as big integer: " + sum);

		BigInteger multiply = BigInteger.valueOf(1);
		for (int i = 1; i <= limit; i++) {
			multiply = multiply.multiply(BigInteger.valueOf(i));
		}

		System.out.println("Multiplication as big integer: " + multiply);

		System.out.println("\nSum as long:        " + sum.longValue());
		System.out.println("Sum as int:         " + sum.intValue());
		System.out.println("Multiplication as long:        " + multiply.longValue());
		System.out.println("Multiplication as int:         " + multiply.intValue());

		double sumAsDouble = 10.05 + 20.10;
		sumAsDouble = sumAsDouble * 0.90 * 0.2;
		System.out.println("Sum as double: " + sumAsDouble);
	}
}
