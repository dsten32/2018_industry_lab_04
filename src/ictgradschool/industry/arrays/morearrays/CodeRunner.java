package ictgradschool.industry.arrays.morearrays;

import java.util.Arrays;
/** Manual translation of AoW's CodeRunner questions - at least as best as I
 *  can capture.
 *
 *  Anyhow, Students should work their way through the Questions and associated
 *  methods populating the location marked "TODO". No hints on number of lines
 *  this time. You can "run" this file (its got an entry point) to get some
 *  feedback on whether your answers are correct. You need 49 out of 49 to pass
 *  this exercise. Alternatively, you can look near the bottom of this file to
 *  find the test cases and the expected values.
 *
 *  I can tell you the last three questions are remarkably simple if you've
 *  solved earlier questions properly.
 *
 * @author John Thompson, jthompso@waikato.ac.nz
 *
 */
public class CodeRunner {

	/** A. Complete the method findOccurrenceOfACharacter() that returns the
	 * number of occurrences of a given character (case sensitive) in a string.
	 * For example,
	 *     findOccurrenceOfACharacter("Hello World", 'o')
	 *
	 * will return:
	 *     2
	 *
	 * and:
	 *     findOccurenceOfACharacter("Goodbye Earth", 'z')
	 *
	 * will return:
	 *     0
	 *
	 * @param searchString A String to search within
	 * @param targetChar A character to search for
	 * @return the number of occurrences of the target character within the
	 *         given String as an int. May be 0
	 */
	public int findOccurrenceOfACharacter(String searchString, char targetChar) {
		// TODO write statements here
		return 0;
	}
	/** findOccurrenceOfACharacter(String, char) => int **/


	/** B. Complete the method getBiggestValue that returns the maximum
	 * value from a given int array. For example,
	 *     getBiggestValue(new int[]{0, 12 ,101})
	 * should print "101" as the biggest value.
	 *
	 * @param values An array of integers in no particular order
	 * @return The maximum value in the array as an int
	 */
	public int getBiggestValue(int[] values) {
		// TODO write statements here
		return 0;
	}
	/** getBiggestValue(int[]) => int **/


	/** C. Complete the method findMostFrequentInteger that returns the
	 * most frequently occurring number in an integer array. For example,
	 * given an integer array:
	 *     {1, 2, 3, 4, 5, 1}
	 * the method will return 1 as the most frequently occurring number.
	 * If there are more than one most frequently occurring number, then
	 * return the smallest number from the most frequently occurring
	 * numbers. For example, given an integer array
	 *     {2, 3, 3, 2, 4, 5, 4}
	 * the method should return 2 as the most frequently occurring number.
	 *
	 */
	public int findMostFrequentInteger(int[] values) {
		// TODO write statements here
		return 0;
	}
	/** findMostFrequentInteger(int[]) => int **/


	/** D. Complete the method getPairSumTo() that takes two parameters, an
	 * integer array and an integer number. The method will then return a
	 * String containing two numbers where the sum of the two numbers is equal
	 * to the given integer number (from the parameter). The number will be
	 * in ascending order and separated by ", ". For example,
	 * 		getPairSumTo(new int[] {1, 2, 3, 4, 5, 6}, 10)
	 * will return the following:
	 * 		"4, 6"
	 * If the method cannot find the right numbers for the sum, the method
	 * will print "0" instead. If the integer array has less than 2 elements,
	 * the method will also print "0".
	 *
	 * @param addends An array of integers that may be used as addends for
	 *                the target sum.
	 * @param targetSum The sum we are attempting to generate from available
	 *                  addends.
	 * @return A String containing the two integers that add the to target
	 *         sum or "0".
	 */
	public String getPairSumTo(int[] addends, int targetSum) {
		// TODO write statements here
		return "";
	}
	/** getPairSumTo(int[], int) => String **/


	/** Q4E. Write the method computeFibonacci() that returns an integer
	 * array of Fibonacci sequence, the size of which is controlled by a given
	 * positive integer number. A Fibonacci sequence is a series of numbers,
	 * where the next number is the sum of the previous numbers. For example,
	 * if the method is given the number 6, it will return an integer array
	 * with size 6 consisting the following numbers: 1, 1, 2, 3, 5, 8.
	 *
	 * When ready to test, uncomment this questions testing block in the
	 * start() method.
	 *
	 * @param size The size of the integer array (and hence number of
	 *             Fibonacci numbers) that this method should generate.
	 * @return A integer array with size entries.
	 */
	// TODO write method here
	/** computeFibonacci(int) => int[] **/


	/** F. Write a method removeDuplicates() that removes duplicate
	 * elements from a given string array and returns the array of unique
	 * elements. Order must not be changed. For example:
	 *     removeDuplicates(new String[] {"abc", "123", "abc"})
	 *
	 * will return the following (as a String array):
	 *     {"abc", "123"}
	 *
	 * @param stringValues An array of String values
	 * @return A String array containing only the unique values of the input
	 *         array
	 */
	// TODO write method here
	/** removeDuplicates(String[]) => String[] **/


	/** G. Write a method findCommonNumbers() that returns an array of
	 * the common elements between two integer arrays. The common numbers
	 * must remain in the order that they are encountered in the first
	 * array. For example:
	 *     findCommonNumbers(new int[] {1, 2, 3, 4, 5},
	 *                       new int[] {6, 7, 8, 9, 2, 4})
	 *
	 * will return the common elements (as an integer array):
	 *     {2, 4}
	 *
	 * If there are no common elements, the method will return an empty
	 * array, such as:
	 *     {}
	 *
	 * Do *not* use Arrays or Collection library methods.
	 *
	 * @param arrayOne The first array of integers
	 * @param arrayTwo The second array of integers
	 * @return An array of integers that are common to both given arrays
	 */
	// TODO write method here
	/** findCommonNumbers(int[], int[]) => int[] **/


	/** H. Write a method convertIntToBinary that converts a given positive
	 * integer to the binary format. The method will return the binary as a
	 * String. For example:
	 *     convertIntToBinary(4)
	 *
	 * will return the following:
	 *     "100"
	 *
	 * @param toConvert An integer to convert to binary
	 * @return the binary representation of the given number as a String
	 */
	// TODO write method here
	/** convertIntToBinary(int) => String **/


	/** ****************************************************************** **/
    /** SRSLY GUYS... DON'T EDIT BELOW THIS LINE                           **/
	/** ****************************************************************** **/
	/** (except when un-commenting tests. but that's it. )                 **/

	/** Keep track of the number of successful tests... */
	int testsPassed = 0;
	/** ... and the number of failed ones. */
	int testsFailed = 0;
	/** The entry point all Java applications have.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// The methods below are all instance methods (no static) so I need to
		// create an instance of CodeRunner before I can call any methods.
		CodeRunner program = new CodeRunner();
		program.start();
	}
	/** main(String[]) => void **/


	/** A block of tests to check the answers Students have entered above.
	 *
	 */
	public void start() {

		// E4PA Find occurrence of a given character in a String array
		System.out.println("Exercise 4 Part A:");
		testResult(1, findOccurrenceOfACharacter("Good morning", 'o'), 3); // Standard
		testResult(2, findOccurrenceOfACharacter("Hello World", 'a'), 0); // No occurrence
		testResult(3, findOccurrenceOfACharacter("Jumping jellyfish!", 'J'), 1); // Case
		testResult(4, findOccurrenceOfACharacter("Taumata whakatangi hangakoauau o tamatea turi pukakapiki maunga horo nuku pokai whenua kitanatahu", 'w'), 2);
		testResult(5, findOccurrenceOfACharacter("", 'z'), 0); // Tricky!
		System.out.println();

		// E4PB Find biggest value in an int array
		System.out.println("Exercise 4 Part B:");
		testResult(1, getBiggestValue(new int[]{-89, 12 ,101}), 101);
		testResult(2, getBiggestValue(new int[]{1, 3 ,0, -7, -100, 2}), 3);
		testResult(3, getBiggestValue(new int[]{1}), 1);
		testResult(4, getBiggestValue(new int[]{0, -5 ,-96, -1}), 0);
		testResult(5, getBiggestValue(new int[]{9, 4 ,2, 4, 8, 9, 7, 5, 3}), 9);
		System.out.println();

		// E4PC Find most frequent integer in an int array
		System.out.println("Exercise 4 Part C:");
		testResult(1, findMostFrequentInteger(new int[]{1, 2, 3, 4, 5, 1}), 1);
		testResult(2, findMostFrequentInteger(new int[]{2, 3, 3, 2, 4, 5, 4}), 2);
		testResult(3, findMostFrequentInteger(new int[]{9}), 9);
		testResult(4, findMostFrequentInteger(new int[]{0, -1, 1, 8, 8, -1, 6, -2}), -1);
		testResult(5, findMostFrequentInteger(new int[]{5, 5, 5}), 5);
		System.out.println();

		// E4PD Find a pair in an integer array that sums to a given integer
		System.out.println("Exercise 4 Part D:");
		testResult(1, getPairSumTo(new int[] {1, 2, 3, 4, 5, 6}, 10), "4, 6");
		testResult(2, getPairSumTo(new int[] {1, 2, 3, 4, 5}, 10), "0");
		testResult(3, getPairSumTo(new int[] {8}, 8), "8");
		testResult(4, getPairSumTo(new int[] {-10, 2, 39, 14, 70, 5}, -8), "-10, 2");
		testResult(5, getPairSumTo(new int[] {2, 3}, 5), "2, 3");
		testResult(6, getPairSumTo(new int[] {0, 1, 3}, 3), "0, 3");
		System.out.println();

		// E4PE Generate x Fibbonacci numbers in array
		System.out.println("Exercise 4 Part E:");
		System.out.println("!Warning - tests commented out");
		/* // Remove the multiline comment to run these tests
		testResult(1, computeFibonacci(6), new int[] {1, 1, 2, 3, 5, 8});
		testResult(2, computeFibonacci(1), new int[] {1});
		testResult(3, computeFibonacci(0), new int[] {0});
		testResult(4, computeFibonacci(2), new int[] {1, 1});
		testResult(5, computeFibonacci(12), new int[] {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144});
		*/
		System.out.println();

		// E4PF Remove duplicates in a String array
		System.out.println("Exercise 4 Part F:");
		System.out.println("!Warning - tests commented out");
		/* // Remove the multiline comment to run these tests
		testResult(1, removeDuplicates(new String[] {"abc", "123"}), new String[] {"abc", "123"});
		testResult(2, removeDuplicates(new String[] {"abc"}), new String[] {"abc"});
		testResult(3, removeDuplicates(new String[] {"hello", "goodbye", "hello", "hello"}), new String[] {"hello", "goodbye"});
		testResult(4, removeDuplicates(new String[] {"blah", "blah", "blah", "blah"}), new String[] {"blah"});
		*/
		System.out.println();

		// E4PG Find common elements between 2 int arrays
		System.out.println("Exercise 4 Part G:");
		System.out.println("!Warning - tests commented out");
		/* // Remove the multiline comment to run these tests
		testResult(1, findCommonNumbers(new int[] {1, 2, 3, 4, 5}, new int[] {6, 7, 8, 9, 2, 4}), new int[] {2, 4});
		testResult(2, findCommonNumbers(new int[] {1, 2, 3, 4, 5}, new int[] {6, 7, 8, 9, 10}), new int[] {});
		testResult(3, findCommonNumbers(new int[] {-1, 79, 43, 5}, new int[] {6, -79, 1, -5, 43}), new int[] {43});
		testResult(4, findCommonNumbers(new int[] {1}, new int[] {2}), {});
		testResult(5, findCommonNumbers(new int[] {100, 2}, new int[] {2, 100}), new int[] {100, 2});
		*/
		System.out.println();

		// E4PH Find common elements between 2 int arrays
		System.out.println("Exercise 4 Part H:");
		System.out.println("!Warning - tests commented out");
		/* // Remove the multiline comment to run these tests
		testResult(1, convertIntToBinary(4), "100");
		testResult(2, convertIntToBinary(0), "0");
		testResult(3, convertIntToBinary(100), "1100100");
		testResult(4, convertIntToBinary(3), "11");
		testResult(5, convertIntToBinary(8), "1000");
		*/
		System.out.println();

		// Results
		System.out.println("== RESULTS ==");
		System.out.println("Tests:  " + (testsPassed + testsFailed));
		System.out.println("Passed: " + testsPassed);
		System.out.println("Failed: " + testsFailed);
		System.out.println("=============");
		System.out.println();
	}
	/** start() => void **/


	/** Version for testing boolean answers.
	 *
	 * @param number
	 * @param result
	 * @param target
	 */
	public void testResult(int number, boolean result, boolean target) {
		System.out.print(" - test #" + number + ": ");
		if (result == target) {
			System.out.println("pass");
			testsPassed++;
		}
		else {
			System.out.println("fail [was " + result + " should be " + target + "]");
			testsFailed++;
		}
	}
	/** testResult(int, boolean, boolean) => void **/


	/** Version for testing int answers.
	 *
	 * @param number
	 * @param result
	 * @param target
	 */
	public void testResult(int number, int result, int target) {
		System.out.print(" - test #" + number + ": ");
		if (result == target) {
			System.out.println("pass");
			testsPassed++;
		}
		else {
			System.out.println("fail [was " + result + " should be " + target + "]");
			testsFailed++;
		}
	}
	/** testResult(int, int, int) => void **/


	/** Version for testing int arrays.
	 *
	 * @param number The test number as an int
	 * @param result An array of ints
	 * @param target An array of ints
	 */
	public void testResult(int number, int[] result, int[] target) {
		boolean areEqual = (result.length == target.length);
		for (int i = 0; areEqual && i < target.length; i++) {
			areEqual = (result[i] == target[i]);
		}
		if (areEqual) {
			System.out.println("pass");
			testsPassed++;
		}
		else {
			System.out.println("fail [was " + Arrays.toString(result) + " should be " + Arrays.toString(target) + "]");
			testsFailed++;
		}
	}
	/** testResults(int, int[], int[]) => void */

	/** Version for testing String answers.
	 *
	 * @param number
	 * @param result
	 * @param target
	 */
	public void testResult(int number, String result, String target) {
		System.out.print(" - test #" + number + ": ");
		if (result.equals(target)) {
			System.out.println("pass");
			testsPassed++;
		}
		else {
			System.out.println("fail [was \"" + result + "\" should be \"" + target + "\"]");
			testsFailed++;
		}
	}
	/** testResult(int, String, String) => void **/

}
