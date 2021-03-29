package Strings;

public class A5ReplaceCharWithOther {
	public static void main(String[] args) {

		String[] array = { "hello", "ello" };
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

		for (int i = 0; i < array.length; i++) {
			String joinedString = array[i];
			char[] chArray = joinedString.toCharArray();
			for (int j = 0; j < chArray.length; j++) {
				char checkIfL = chArray[j];

				if (checkIfL == 108) {
					chArray[j] = 'a';
				}
			}

			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < chArray.length; j++) {
				sb.append(chArray[j]);
			}
			array[i] = sb.toString();
		}

		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

	}

}
