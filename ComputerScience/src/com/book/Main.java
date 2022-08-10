package com.book;

import com.book.exercise.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("The answer is: " + FirstChapter.randomGaussian());
		System.out.println("При размещени 1000$ под 25% на 10 лет, вы получите: " + (int)
		FirstChapter.interestCapitalization(10, 1000, 25) + "$");

	}
}