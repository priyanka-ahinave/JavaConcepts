package array;

import java.util.Arrays;

public class OddEven {
	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 3, 5, 2, 4, 6, 8 };
		// for (int i : numbers) {
		// System.out.println(i);
		// }

		int[] output = new int[numbers.length];
		int evenIndex = 0;
		int oddIndex = 1;
		for (int i : numbers) {
			if (i % 2 == 0) {
				output[evenIndex] = i;
				evenIndex += 2;
			} else {
				output[oddIndex] = i;
				oddIndex += 2;
			}
		}
		Arrays.sort(output);
		for (int i : output) {
			System.out.println(i);
		}

	}
}
