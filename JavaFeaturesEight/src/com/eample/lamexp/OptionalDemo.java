package com.eample.lamexp;

import java.util.Optional;

//Driver Class
public class OptionalDemo {
	// Main Method
	public static void main(String[] args) {
		String[] words = new String[10];

		Optional<String> checkNull = Optional.ofNullable(words[9]);

		if (checkNull.isPresent()) {
			String word = words[9].toLowerCase();
			System.out.print(word);
		} else {
			System.out.println("word is null");
		}
	}
}