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
	 * Упражнение 1.2.24
	 * Капитализация процентов которую вы получите через t лет при размещении P долларов
	 * под ежегодный процент r (непрерывно начисляемый).
	 */
	public static double interestCapitalization(double t, double p, double r) {
		return p * Math.pow(Math.E, r * t);
	}
	
	/**
	 * Упражнение 1.2.25
	 * Охлаждение под действием ветра.
	 */
	public static  double windCooling(double temperature, double velocity) {
		if ((temperature < 50) && ((velocity < 120) && (velocity > 3)))
			return (35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity, 0.16));
		else {
			System.out.println("Incorrect input values...");
			return 0.00;
		}
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
