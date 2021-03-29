package array;

//TO do : WIP 
public class countFrequencyOfEachElement {

	public static void main(String[] args) {

		int[] arrayOne = new int[] { 1, 2, 3, 4, 5, 5, 5, 6, 10, 10 };
		int[] arrFreq = new int[arrayOne.length];

		for (int i = 0; i < arrayOne.length; i++) {
			if (arrFreq[arrayOne[i]] == 0) {
				arrFreq[arrayOne[i]] = 1;
			} else {
				arrFreq[arrayOne[i]]++;
			}
		}

		for (int i = 0; i < arrFreq.length; i++) {
			System.out.println("Element " + i + " occoured " + arrFreq[i] + " Times");
		}
	}

}
