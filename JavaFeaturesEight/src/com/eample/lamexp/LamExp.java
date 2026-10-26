package com.eample.lamexp;

//Java code to illustrate lambda expression
//without parameters

//functional interface
//without parameters
interface Test1 {
	void print();
}

class GfG {
	// functional interface parameter is passed
	static void fun(Test1 t) {
		t.print();
	}

	public static void main(String[] args) {
		// lambda expression is passed
		// without parameter to functional interface t
		fun(() -> System.out.println("Hello"));
	}
}