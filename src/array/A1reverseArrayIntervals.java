package array;

public class A1reverseArrayIntervals {
	// Java program to reverse every sub-array formed by
	// consecutive k elements
	static class GFG {

		// Function to reverse every sub-array formed by
		// consecutive k elements
		static void reverse(int arr[], int k) {
			for (int i = 0; i < arr.length; i += k) {
				int left = i;

				// to handle case when k is not multiple
				// of n
				int right = Math.min(i + k - 1, arr.length - 1);
				int temp;

				// reverse the sub-array [left, right]
				while (left < right) {
					temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					left += 1;
					right -= 1;
				}
			}
		}

		// Driver method
		public static void main(String[] args) {

			int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
			int k = 4;

			int n = arr.length;

			reverse(arr, k);

			for (int i = 0; i < n; i++)
				System.out.print(arr[i] + " ");
		}
	}
}
