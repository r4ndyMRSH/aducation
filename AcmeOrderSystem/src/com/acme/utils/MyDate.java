package com.acme.utils;

public class MyDate {
	private byte day;
	private byte month;
	private short year;
	private static MyDate [] holidays;
	
	static {
		holidays = new MyDate [6];
		holidays [0] = new MyDate(1, 1, 2022);
		holidays [1] = new MyDate(5, 30, 2022);
		holidays [2] = new MyDate(7, 4, 2022);
		holidays [3] = new MyDate(9, 5, 2022);
		holidays [4] = new MyDate(11, 24, 2022);
		holidays [5] = new MyDate(12, 25, 2022);
	}

	{
		day = 1;
		year = (short) 2000;
		month = 1;
	}
	
	//Constructors
	public MyDate() {
		this(1, 1, 1900);

	}

	public MyDate(int month, int day, int year) {
		setDate(month, day, year);
	}

	public static void leapYears() {
		for (int i = 1752; i <= 2020; i++) {
			if (i % 4 == 0)
				System.out.println("The year " + i + "is a leap year");
		}
	}
	
	//Class methods
	public boolean valid(int day, int month, int year) {
		if (day > 31 || day < 1 || month > 12 || month < 1) {
			System.out.println("Attempting to create a non-valid date " + month + "/" + day + "/" + year);
			return false;
		}
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			return (day <= 30);
		case 2:
			return day <= 28 || (day == 29 && year % 4 == 0);
		}
		return true;
	}
	
	public static void listHolidays() {
		System.out.println("the holidays are:");
		for (MyDate holiday : holidays) {
			System.out.println(holiday);
		}
	}
	
	//Overrided methods
	@Override
	public boolean equals(Object o) {
		if (o instanceof MyDate) {
			MyDate d = (MyDate) o;
			if ((d.day == day) && (d.month == month) && (d.year == year)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return month + "/" + day + "/" + year;
	}

	//Getters & Setters
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (valid(day, month, year)) {
			this.day = (byte) day;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (valid(day, month, year)) {
			this.year = (short) year;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (valid(day, month, year)) {
			this.month = (byte) month;
		}
	}

	public void setDate(int month, int day, int year) {
		if (valid(day, month, year)) {
			this.day = (byte) day;
			this.month = (byte) month;
			this.year = (short) year;
		}
	}

	public static MyDate[] getHolidays() {
		return holidays;
	}

}
