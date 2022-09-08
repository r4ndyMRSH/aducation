package com.acme.utils;

public class InvalidDateException extends Exception {
	
	//Constructor
	public InvalidDateException(MyDate date) {
		super("Invalid date values on: " + date);
	}

}
