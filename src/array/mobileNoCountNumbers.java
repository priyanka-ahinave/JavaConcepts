package array;

import java.util.Arrays;
import java.util.Scanner;

public class mobileNoCountNumbers {

	public static void mainx(String[] args) {
		int[] counts = new int[10];
		Scanner sc = new Scanner(System.in);
		int numberCount = 2;
		long[] numbers = new long[numberCount];

		for (int i = 0; i < numberCount; i++) {
			numbers[i] = sc.nextLong();
		}
		sc.close();

		for (long number : numbers) {
			System.out.println(number);
			int digitCount = 0;
			while (number > 0) {
				digitCount += 1;
				int lastDigit = (int) (number % 10);
				number = number / 10;
				counts[lastDigit] += 1;
			}
			counts[0] += (10 - digitCount);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + counts[i]);
		}

	}

	public static void main(String[] args) {
		String number = "0000001111122223334452342342323423424";
		char[] numberChars = number.toCharArray();
		Arrays.sort(numberChars);
		System.out.println(numberChars);
		int[] counts = new int[10];
		for (char c : numberChars) {
			counts[Character.getNumericValue(c)] += 1;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(counts[i]);
		}
	}

}
