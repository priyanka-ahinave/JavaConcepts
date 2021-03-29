package Strings;

import java.util.Scanner;

public class A2MaxApperedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //?????????????????????????
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String sInput = sc.next();
		sc.close();

		char chArr[] = sInput.toCharArray();
		// char[] sChars = new char[chArr.length];
		int[] iCount = new int[chArr.length];

		for (int i = 0; i < chArr.length; i++) {
			iCount[i] = 1;
			for (int j = i + 1; j < chArr.length; j++) {
				if (chArr[i] == chArr[j] && chArr[i] != ' ' && chArr[i] != '0') {
					iCount[i]++;

					// Set string[j] to 0 to avoid printing visited character
					chArr[j] = '0';
				}
			}
		}

		int min = iCount[0];
		int max = iCount[0];
		char minChar = chArr[0];
		char maxChar = chArr[0];
		for (int i = 0; i < iCount.length; i++) {
			if (min > iCount[i]) {
				min = iCount[i];
				minChar = chArr[i];
			}
			if (max < iCount[i]) {
				max = iCount[i];
				maxChar = chArr[i];
			}
		}

		System.out.println("Character is " + minChar + ":=" + min);
		System.out.println("Character is " + maxChar + ":=" + min);
	}

}
