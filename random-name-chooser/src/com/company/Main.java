package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// 1. A list of names "joe" "alex" and "tenzin"

		// 2. Put the list of names in an array?
		String names[] = {
				"Ahmad", // 0
				"Alex", // 1
				"Alex", // 1
				"Alex", // 1
				"Aziel", // 2
				"Daniel", // 3
				"Devon",
				"Diego",
				"Julien",
				"KungGeng",
				"Shaylee",
				"Tezin",
				"Thanhbinh", // names.length-1
				"AlmightyCoachJojo"
		};

//		System.out.println(names[0]); // ?? "Ahmad"
//		System.out.println(names.length-1);
//		System.out.println(names[names.length-1]); // ?? "Shaylee"


		// 3. Get a random number between 0 and 10
		int randomInt = new Random().nextInt(names.length);

        // 5. Goal: Pick a /random/ name from our list of names.
		System.out.println(names[randomInt]);

		Object[] uniqueNames = Arrays.stream(names).distinct().toArray();
		System.out.printf("Names with duplicates: %s\n", Arrays.toString(names));
		System.out.printf("Names without duplicates: %s\n", Arrays.toString(uniqueNames));

	}
}
