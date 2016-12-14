package com.embassy.time;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class LocalTime {
	public static final String hh_mm_ss_SSS = "HH:mm:ss,SSS";
	
	public org.joda.time.LocalTime fromString(String time, String format) {
		DateTimeFormatter formatter = DateTimeFormat.forPattern(format);
		return formatter.parseLocalTime(time);
	}
}
