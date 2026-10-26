package com.eample.lamexp;

@FunctionalInterface
interface Operate {
	int execute(int a, int b);
}

public class MethodReferenceExample {
	public static void main(String[] args) {
		int result = performOperation(5, 3, MethodReferenceExample::add);
		System.out.println(result); // Output: 8
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int performOperation(int a, int b, Operate operate) {
		return operate.execute(a, b);
	}
}