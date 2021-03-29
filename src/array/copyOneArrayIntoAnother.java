package array;

public class copyOneArrayIntoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] firstArray = new int[5];
		int[] firstArray = new int[] { 1, 2, 3, 4, 5 };
		int[] secondArray = new int[firstArray.length];

		for (int i = 0; i < firstArray.length; i++) {
			secondArray[i] = firstArray[i];
		}

		System.out.println("Elements of first array are:");
		for (int i = 0; i < firstArray.length; i++) {
			System.out.print(firstArray[i] + " ");
		}

		System.out.println();
		System.out.println("Elements of second array are:");
		for (int i = 0; i < firstArray.length; i++) {
			System.out.print(secondArray[i] + " ");
		}
	}

}
