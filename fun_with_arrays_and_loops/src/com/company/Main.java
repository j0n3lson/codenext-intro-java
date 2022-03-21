package com.company;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// We're going to draw Ascii art using arrays and loops!
		// An example of ascii art might be a simple square:
		// Example Ascii Square:
		// ['-', '-', '-', '-', '-']
		// ['-', '*', '*', '*', '-']
		// ['-', '*', '*', '*', '-']
		// ['-', '*', '*', '*', '-']
		// ['-', '-', '-', '-', '-']

		// Jump to the definition of each function to find out what it does.
		basicEmptyMatrix();
		matrixWithAsciiSquare();
		matrixWithEntriesSetByIndex();
		loopGeneratedMatrix();

		// Run solutions to the challenges:
		challenge3();

		// Challenge 4: Not only can we initialize the array to zeros,
		// we can also take this opportunity to create our shape. Make your own
		// called createSquare() that draws the example ascii square. Add your
		// method here to run it.
		challenge4();
	}

	/**
	 * Prints a hard-coded matrix initialized with all '-' set.
	 */
	private static void basicEmptyMatrix() {
		// 1. Hardcoded Matrix: Let's create a 5x5 2-D Matrix
		// Refer to the class slides. There are 5 rows and 5 columns
		char[][] matrix1 = {
				{'-', 'j', '-', '-', '-'},
				{'-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-'},
		};
		printMatrix("matrix1", "Empty matrix.", matrix1);
	}

	/**
	 * Draws a matrix with an ascii square.
	 */
	private static void matrixWithAsciiSquare() {
		// 2. Hard Coded Ascii Square: Let's create a square. If an entry is
		// shaded then we'll set the value to '*', otherwise leave as '-'.

		// It's "hard coded" because we manually have to set each entry.
		char[][] matrix2 = {
				{'-', '-', '-', '-', '-'},
				{'-', '*', '*', '*', '-'},
				{'-', '*', '*', '*', '-'},
				{'-', '*', '*', '*', '-'},
				{'-', '-', '-', '-', '-'},
		};
		printMatrix("matrix2", "Hard coded matrix.", matrix2);
	}

	/**
	 * Draws a matrix by setting each entry using the entry's index in the matrix.
	 * <p>
	 * Try to complete the challenges we set up for you.
	 */
	private static void matrixWithEntriesSetByIndex() {
		// 3. Hard Coded Ascii Square: Let's create the same square again. But
		// maybe I don't want to move manually edit the matrix. I can use array
		// indices to set a list of entries that should be turned on. When we
		// index into an array, we're using the entry's /POSITION/ in the array
		// to set the entry.

		// Start with initial array -- nothing is set
		char[][] matrix3 = {
				{'-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-'},
				{'-', '-', '-', '-', '-'},
		};
		// Then set a specific entry in the array using the index, then print it.
		matrix3[1][1] = '*';
		printMatrix("matrix3", "Matrix with one entry set.", matrix3);
		// Let's set the others
		matrix3[1][2] = '*';
		matrix3[1][3] = '*';
		printMatrix("matrix3", "Matrix with first row.", matrix3);

		// Challenge 1: Fill out the square by setting the remaining entries
		// using the array indexes. Add printMatrix() statements to check
		// your work. Your square should look something like this:
		// ['-', '-', '-', '-', '-']
		// ['-', '*', '*', '*', '-']
		// ['-', '*', '*', '*', '-']
		// ['-', '*', '*', '*', '-']
		// ['-', '-', '-', '-', '-']

		// Uncomment each line and enter the correct x,y values to make the shape.
		// matrix3[x][y] = '*';
		// matrix3[x][y] = '*';
		// matrix3[x][y] = '*';
		//
		// matrix3[x][y] = '*';
		// matrix3[x][y] = '*';
		// matrix3[x][y] = '*';

		// Challenge 2: Can you make other shapes using indices?
	}

	/**
	 * Draws a matrix generated with a loop.
	 */
	private static void loopGeneratedMatrix() {
		// 4. Shapes with loops: I'm a lazy coder \o/ and i don't feel like
		// writing all those pesky '-'s and '*'s...that's what computers
		// are good at. Whenever we want to do something over-and-over again,
		// we can use a for-loop. you've been using them this entire time
		// (check out the printMatrix() method).
		//
		// Let's use a for-loop to /create/ an nxn matrix:

		// Tell the computer we want an array of size numberOfRows. Each entry
		// of the first array contains another array of size numberOfColumns.
		int numberOfRows = 10;
		int numberOfColumns = 10;
		char matrix4[][] = new char[numberOfRows][numberOfColumns];

		// Now let's /loop/ through and set each entry
		for (int row = 0; row < numberOfRows; row++) {
			for (int column = 0; column < numberOfColumns; column++) {
				// Challenge 3: Can you make each alternating line a
				// different character?
				// Example:
				//
				// ['-', '-', '-', '-', '-']
				// ['*', '*', '*', '*', '*']
				// ['-', '-', '-', '-', '-']
				// ['*', '*', '*', '*', '*']
				// ['-', '-', '-', '-', '-']
				matrix4[row][column] = '-';
			}
		}
		printMatrix("matrix4", "an NxN generated matrix.", matrix4);
	}

	/**
	 * Prints an NxN matrix on the command line.
	 */
	public static void printMatrix(String name, String description, char[][] matrix) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		System.out.println(String.format("Printing matrix: %s (%d x %d)", name, rows, columns));
		System.out.println("Description: " + description);
		for (char[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
		System.out.println();
	}

	/**
	 * Creates a matrix of NxN size and initializes it to all '-'s.
	 * <p>
	 * Example:
	 * <p>
	 * ['-', '-', '-', '-', '-']
	 * ['-', '-', '-', '-', '-']
	 * ['-', '-', '-', '-', '-']
	 * ['-', '-', '-', '-', '-']
	 * ['-', '-', '-', '-', '-']
	 */
	static char[][] createMatrix(int numberOfRows, int numberOfColumns) {
		char matrix[][] = new char[numberOfRows][numberOfColumns];
		for (int row = 0; row < numberOfRows; row++) {
			for (int column = 0; column < numberOfColumns; column++) {
				matrix[row][column] = '-';
			}
		}
		return matrix;
	}

	/**
	 * Prints a matrix with alternating lines filled in
	 * <p>
	 * Example:
	 * ['-', '-', '-', '-', '-']
	 * ['*', '*', '*', '*', '*']
	 * ['-', '-', '-', '-', '-']
	 * ['*', '*', '*', '*', '*']
	 * ['-', '-', '-', '-', '-']
	 */
	public static void challenge3() {
		char[][] matrix = createMatrix(5, 5);
		for (int rowNumber = 0; rowNumber < matrix.length; rowNumber++) {
			for (int columnNumber = 0; columnNumber < matrix[rowNumber].length; columnNumber++) {
				// Check if we're on an odd row, if so we'll shade the entries
				// on that row.
				if (rowNumber % 2 != 0) {
					matrix[rowNumber][columnNumber] = '*';
				}
			}
		}
		printMatrix("challenge3", "Matrix with odd rows shaded", matrix);
	}

	/**
	 * Draws an ascii sqaure.
	 * <p>
	 * In this method we dynamically generate the square inside the matrix.
	 */
	public static void challenge4() {
		char[][] matrix = createMatrix(5, 5);
		// The trick to this is checking the bounds! These variables us figure
		// out when to shade an entry in the matrix. We'll shade any entry that
		// is between these /bounds/.
		int startColumn = 1;
		int endColumn = 3;
		int startRow = 1;
		int endRow = 3;
		for (int rowNumber = 0; rowNumber < matrix.length; rowNumber++) {
			for (int columnNumber = 0; columnNumber < matrix[rowNumber].length; columnNumber++) {
				if (columnNumber >= startColumn && columnNumber <= endColumn) { // Has to be between the columns
					if (rowNumber >= startRow && rowNumber <= endRow) { // ... AND between the rows
						matrix[rowNumber][columnNumber] = '*';
					}
				}
			}
		}
		printMatrix("challenge4", "Dynamically generated ascii square", matrix);
	}
}
