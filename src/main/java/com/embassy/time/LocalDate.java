package com.embassy.time;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class LocalDate {
	public static String YYYY_MM_dd = "YYYY-MM-dd";
	
	public org.joda.time.LocalDate fromString(String date, String format) {
		DateTimeFormatter formatter = DateTimeFormat.forPattern(format);
		return formatter.parseLocalDate(date);
	}
}
