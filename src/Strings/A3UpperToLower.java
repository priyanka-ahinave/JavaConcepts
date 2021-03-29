package Strings;

import java.util.Scanner;

public class A3UpperToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Solved using ANSCII values of A=65 to Z=90 && a=97 to z=122
		System.out.println("Enter the string :");
		Scanner sc = new Scanner(System.in);
		String sInput = sc.nextLine();
		sc.close();

		char arr[] = sInput.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char uc = arr[i];
			if (uc >= 65 && uc <= 90) {
				char lc = (char) (((int) uc) + 32);// Add 32 to convert char
													// into lower case
				arr[i] = lc;
			}
		}
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a]);
		}

	}

}
