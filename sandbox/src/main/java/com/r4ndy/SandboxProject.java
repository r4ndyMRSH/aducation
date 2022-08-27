package com.r4ndy;

import java.util.Scanner;

public class SandboxProject {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		StringBuilder sbstr = new StringBuilder(input.nextLine());
		System.out.println(sbstr.toString() + " " + sbstr.capacity());
		input.close();
		
	}
	
	public String testerLambda (Testable t) {
		String s = "";
		return s;
	}

}