package array;

import java.util.ArrayList;
import java.util.Arrays;

public class A2EvenOddSort {
	// static int[] sortedArr;
	static boolean even = false;
	static boolean odd = false;
	static String flag = "";

	public static void main(String[] args) {
		ArrayList<Integer> arrayLst = new ArrayList<>();

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the size of array :");
		// int iSize = sc.nextInt();
		// int[] arr = new int[iSize];
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = sc.nextInt();
		// }
		// sc.close();

		int[] arr = { 7, 4, 8, 3, 10, 5, 6 };
		Arrays.sort(arr);
		System.out.print("Original sorted array :");
		printArray(arr);

		firstNoCheckEvenOdd(arr[0]);

		arrayLst.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {

			checkNextNumber(arr[i]);
			// current number is even and flag(previous number) is odd means
			// insert the number
			if (even && flag == "odd") {
				arrayLst.add(arr[i]);
				flag = "even";
			}
			// current number is odd and flag(previous number) is even means
			// insert the number
			else if (odd && flag == "even") {
				arrayLst.add(arr[i]);
				flag = "odd";
			}

		}

		System.out.println();
		System.out.print("Even-Odd Sort:");
		for (int i : arrayLst) {
			System.out.print(" " + i);
		}

	}

	// Simply printing the array
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}

	// checking the next numbers and setting flags accordingly
	private static boolean checkNextNumber(int i) {
		if (i % 2 == 0) {
			even = true;
			odd = false;
			return true;
		} else {
			odd = true;
			even = false;
			return false;
		}
	}

	// Check first number and set the flags accordingly
	// BAsed on the 'flag' value we can decided which number to put next
	private static boolean firstNoCheckEvenOdd(int i) {
		if (i % 2 == 0) {
			even = true;
			flag = "even";
			return true;
		} else {
			odd = true;
			flag = "odd";
			return false;
		}
	}

}
