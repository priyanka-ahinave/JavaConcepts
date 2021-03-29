package Strings;

import java.util.Scanner;

public class A4SubstringPresentOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string: ");
		String sMainString = sc.nextLine();
		System.out.println("Enter the substring :");
		String sSubstring = sc.nextLine();
		sc.close();

		if (sMainString.contains(sSubstring)) {
			System.out.println("Substring is present in main string");
		} else {
			System.out.println("Substing is absent in main string");
		}
	}
}
