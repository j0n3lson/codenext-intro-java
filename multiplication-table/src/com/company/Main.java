package com.company;

public class Main {

	public static void main(String[] args) {
		// 1. Print the header row
		printHeader();

		// 2. Print the multiplication table
		int maxNumber = 10;
		System.out.println();
		for (int rowNumber = 1; rowNumber < maxNumber; rowNumber++) {
			System.out.printf("%3s:", rowNumber);
			for (int columnNumber = 1; columnNumber < maxNumber; columnNumber++) {
				System.out.printf("%3s", rowNumber*columnNumber);
			}
			System.out.println();
		}
	}

	private static void printHeader() {
		System.out.printf("%4s"," ");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%3s", i);
		}
		System.out.println();
		// TODO: Do better Joe...somehow \o/
		System.out.printf("%3s"," ");
		for (int i = 0; i < 10; i++) {
			System.out.print("---");
		}
	}
}
