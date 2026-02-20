package org.javaturk.ioop.ch13.day;

public class EnumSwitchDemo {
	Day day;

	public static void tellItLikeItIs(Day day) {
		String message = switch (day) {
		case MONDAY -> "Mondays are bad :(";
		case FRIDAY -> "Fridays are better :)";
		case SATURDAY, SUNDAY -> "Weekends are best :) :) :)";
		default -> "Midweek days are so-so.";
		};

		System.out.println(message);
	}

	public static void main(String[] args) {
		tellItLikeItIs(Day.MONDAY);
		tellItLikeItIs(Day.WEDNESDAY);
		tellItLikeItIs(Day.SATURDAY);
		tellItLikeItIs(Day.SUNDAY);
	}
}
