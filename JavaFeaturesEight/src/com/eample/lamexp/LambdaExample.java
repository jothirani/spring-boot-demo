package com.eample.lamexp;

@FunctionalInterface
interface Operation {
	int execute(int a, int b);
}

public class LambdaExample {
	public static void main(String[] args) {
		Operation add = (a, b) -> a + b;
		int result = performOperation(5, 3, add);
		System.out.println(result); // Output: 8
	}

	public static int performOperation(int a, int b, Operation operation) {
		return operation.execute(a, b);
	}
}