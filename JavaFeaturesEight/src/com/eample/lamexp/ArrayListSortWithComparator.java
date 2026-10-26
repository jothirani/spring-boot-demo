package com.eample.lamexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortWithComparator {

	// Custom class for demonstration
	static class Person {
		String name;
		int age;

		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return name + " (" + age + ")";
		}
	}

	public static void main(String[] args) {
		// Example 1: Sorting Integers
		List<Integer> numbers = new ArrayList<>();
		Collections.addAll(numbers, 5, 2, 9, 1, 7);

		// Ascending order
		numbers.sort(Comparator.naturalOrder());
		System.out.println("Integers Ascending: " + numbers);

		// Descending order
		numbers.sort(Comparator.reverseOrder());
		System.out.println("Integers Descending: " + numbers);

		// Example 2: Sorting Custom Objects
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));

		// Sort by age (ascending)
		people.sort(Comparator.comparingInt(x -> x.age));
		System.out.println("People by Age Ascending: " + people);

		// Sort by age (descending)
		people.sort(Comparator.comparingInt((Person p) -> p.age).reversed());
		System.out.println("People by Age Descending: " + people);

		// Sort by name (alphabetical)
		people.sort(Comparator.comparing(p -> p.name));
		System.out.println("People by Name: " + people);
	}
}
