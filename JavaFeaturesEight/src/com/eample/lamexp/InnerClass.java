package com.eample.lamexp;

//Outer class
class OuterClass {

	private String outerMessage = "Hello from Outer Class!";

	// Inner class
	class InnerClass {
		// Method inside inner class
		public void displayMessage() {
			// Inner class can access private members of outer class
			System.out.println(outerMessage);
			System.out.println("Hello from Inner Class!");
		}
	}

	// Method in outer class to use inner class
	public void useInnerClass() {
		InnerClass inner = new InnerClass(); // Create inner class object
		inner.displayMessage(); // Call inner class method
	}

	// Main method to run the program
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.useInnerClass(); // Trigger inner class method
	}
}
