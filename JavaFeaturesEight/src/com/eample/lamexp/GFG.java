package com.eample.lamexp;

class GFG {

	private int number = 10;

	void display() {

		Runnable r = () -> {
			System.out.println("Instance variable: " + number);
		};
		r.run();
	}

	public static void main(String[] args) {

		// GFG a=new GFG();
		// System.out.println(a.number);
//     double i = 34.32; //given number
//    System.out.println("value"+Math.ceil(i));

		int num = Integer.parseInt(args[0]); // taking value as command line argument.
		int temp = num, result = 0; // Logic for sum of digit
		while (temp > 0) {
			result = result + temp;
			temp--;
			System.out.println("inside loop" + temp);
		}
		System.out.println("outside loop" + temp);
		System.out.println(num + "hhhhh" + result);
		// Logic for product of digit temp = num;
		result = 1;
		while (temp > 0) {
			result = result * temp;
			temp--;
		}
		System.out.println(num + "," + result);

	}
}
// new GFG().display();
