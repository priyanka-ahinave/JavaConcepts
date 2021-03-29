package array;

import java.util.Arrays;
import java.util.Scanner;

public class A3SecondHighestNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int iSize = sc.nextInt();

		int[] arr = new int[iSize];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < iSize; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(arr);

		System.out.println("Second largest no is :" + arr[arr.length - 2]);
	}
}
