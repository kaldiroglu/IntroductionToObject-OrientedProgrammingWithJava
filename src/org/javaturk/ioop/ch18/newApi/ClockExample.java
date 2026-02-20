package org.javaturk.ioop.ch18.newApi;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class ClockExample {

	public static void main(String[] args) throws InterruptedException {
		run1();
		run2();
	}

	static void run1() {
		Clock now = Clock.systemDefaultZone();
		System.out.println(now);
		Instant nowInstant = now.instant();
		System.out.println(nowInstant);
		System.out.println();
		long milliSeconds = now.millis();
		System.out.println("Milliseconds since January 1st, 1970: " + milliSeconds);

		milliSeconds = System.currentTimeMillis();
		System.out.println("Milliseconds since January 1st, 1970: " + milliSeconds);

		Clock nowIstanbul = Clock.system(ZoneId.of("Europe/Istanbul"));
		System.out.println(nowIstanbul);
		nowInstant = nowIstanbul.instant();
		System.out.println(nowInstant);

		System.out.println();

		Clock zuluClock = Clock.systemUTC();
		System.out.println(zuluClock);
		Instant zuluInstant = zuluClock.instant();
		System.out.println(zuluInstant);
	}

	static void run2() throws InterruptedException {
		
		for (int i = 0; i < 10; i++) 
			getLapseTime();
	}
	
	public static void getLapseTime() throws InterruptedException {
		Clock clock = Clock.systemDefaultZone();
		long start = clock.millis();

		Thread.sleep(1_000);
		
		long stop = clock.millis();
		long lapseTimeInMillisecond = stop - start;
		
		System.out.println("Lapse time in milli seconds: " + lapseTimeInMillisecond);
	}
}
