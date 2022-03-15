package com.javagenerics;

public class Logic {

	public <T extends Comparable<T>> T findMax(T a, T b, T c) {
		System.out.println("The numbers are : " + a + ","
				+ b + "," + c);
		T max = a;
		if (max.compareTo(b) < 0) {
			max = b;
		}
		if (max.compareTo(c) < 0) {
			max = c;
		}
		return max;
	}
}
