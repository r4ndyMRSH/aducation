package com.r4ndy;

import java.util.Arrays;
import java.util.List;

public class Collections {
	public static void main(String[] args) {
		String[] langs = { "java", "C#", "Python", "PHP" };
		List<String> languages = Arrays.asList(langs);

//		languages.add(0, "Java");
//		languages.add(1, "C#");
//		languages.add(2, "Python");
//		languages.add(3, "PHP");

		for (int i = 0; i < langs.length; i++) {

			System.out.println("I want to learn " + languages.get(i));
		}

		for (String l : langs) {
			System.out.println("I want to learn " + l);
		}
	}

}
