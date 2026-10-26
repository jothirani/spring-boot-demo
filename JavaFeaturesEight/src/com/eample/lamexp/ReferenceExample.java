package com.eample.lamexp;

public class ReferenceExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		modifyStringBuilder(sb);
		System.out.println(sb.toString()); // Output: Hello World
	}

	public static void modifyStringBuilder(StringBuilder sb) {
		sb.append(" World");
	}
}