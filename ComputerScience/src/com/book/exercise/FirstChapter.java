package com.book.exercise;

public class FirstChapter {

	public static double g = 9.80665;

	/**
	 * Упражнение 1.2.2
	 */
	public static double trigonomCheck1(double theta) {
		return Math.sin(theta) * Math.sin(theta) + Math.cos(theta) * Math.cos(theta);
	}

	/**
	 * Упражнение 1.2.3
	 */
	public static boolean truthCheck(boolean a, boolean b) {
		return (!(a && b) && (a || b)) || ((a && b) || !(a || b));
	}

	/**
	 * Упражнение 1.2.14
	 */
	public static boolean truthCheck2(int a, int b) {
		if ((a > 0 && b > 0) && ((a % b == 0) || (b % a == 0))) {
			return true;
		} else
			return false;
	}

	/**
	 * Упражнение 1.2.15
	 */
	public static boolean sidesOfATriangle(int a, int b, int c) {
		if (a < 0 || b < 0 || c < 0) {
			System.out.println("Negative number");
			return false;
		}
		if ((a >= (b + c)) || (b >= (a + c)) || (c >= (a + b)))
			return false;
		else
			return true;
	}

	/**
	 * Упражнение 1.2.18
	 */
	public static double euclideanDistance(double x, double y) {
		return Math.sqrt((x * x) + (y * y));
	}

	/**
	 * Упражнение 1.2.19
	 */
	public static int randomRange(int a, int b) {
		return ((int) (Math.random() * (b - a)) + a);
	}

	/**
	 * Упражнение 1.2.20
	 */
	public static int random2d6() {
		return (int) (Math.random() * 6 + 1);
	}

	/**
	 * Упражнение 1.2.21
	 */
	public static double sinSin1(double t) {
		return (Math.sin(2 * t) + Math.sin(3 * t));
	}

	/**
	 * Упражнение 1.2.22
	 */
	public static double upWay(double x0, double v0, double t) {
		return (x0 + (v0 * t) - (g * t * t / 2));
	}
	/**
	 * Упражнение 1.2.27
	 * Вывод случайного числа r из гауссовского распределения с использованием
	 * формулы Бокса-Мюллера
	 * r=sin(2*pi*v)*sqrt(-2lnu)
	 * где u и v - вещественные числа в диапозоне от 0 до 1.
	 */
	public static double randomGaussian () {
		double u = Math.random();
		double v = Math.random();
		return Math.sin(2 * Math.PI * v) * Math.sqrt(-2 * Math.log(u));
	}

}