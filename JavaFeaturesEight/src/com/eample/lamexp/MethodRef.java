package com.eample.lamexp;

import java.util.Arrays;

public class MethodRef {

	// Method
	public static void print(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {

		String[] names = { "Geek1", "Geek2", "Geek3" };

		// Using method reference to print each name
		Arrays.stream(names).forEach(MethodRef::print);
	}
}
