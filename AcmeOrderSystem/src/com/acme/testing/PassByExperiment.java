package com.acme.testing;

import com.acme.utils.MyDate;

public class PassByExperiment {
	public static void main(String[] args) {
		MyDate date = new MyDate(1, 20, 2018);
		System.out.println("Before passing an oblect :" + date);
		passObject(date);
		System.out.println("After passing an oblect :" + date);

		System.out.println("Before passing a primitive " + date.getYear());
		passPrimitive(date.getYear());
		System.out.println("After passing a primitive " + date.getYear());

		String x = date.toString();
		System.out.println("Before passing a String " + x);
		passString(x);
		System.out.println("After passing a String " + x);
		
		StringBuilder y = new StringBuilder(date.toString());
		System.out.println("Before passing a StringBuilder " + y);
		passStringBuilder(y);
		System.out.println("After passing a StringBuilder " + y);

	}

	public static void passObject(MyDate d) {
		d.setYear(2009);
	}

	public static void passPrimitive(int i) {
		i = 2010;
	}

	public static void passString(String s) {
		int yearSlash = s.lastIndexOf('/');
		s = s.substring(0, yearSlash + 1);
		s += "2012";
		System.out.println("New date string: " + s);
	}
	
	public static void passStringBuilder(StringBuilder sb) {
		int yearSlash  = sb.toString().lastIndexOf('/');
		sb.delete(yearSlash, yearSlash + 5);
		sb.append("/2012");
		System.out.println("New date string: " + sb);
	}

}
