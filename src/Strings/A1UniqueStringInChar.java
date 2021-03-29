package Strings;

import java.util.Scanner;

public class A1UniqueStringInChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstfoundAt = -1;
		int secondOccurance = -1;
		Scanner sc = new Scanner(System.in);
		// Read the inputs
		System.out.println("Enter the first String :");
		String firstString = sc.nextLine();

		System.out.println("Enter the character :");
		String secondString = sc.nextLine();

		sc.close();
		// remove all spaces
		firstString = firstString.replaceAll("\\s", "");

		// if string presents then perform the operations
		if (firstString.contains(secondString)) {

			firstfoundAt = firstString.indexOf(secondString);

			secondOccurance = firstString.indexOf(secondString, firstfoundAt + 1);

			if (firstfoundAt > secondOccurance) {
				System.out.println("Output :" + firstString.substring(firstfoundAt + 1)); // if
																							// substring
																							// string
																							// occoured
																							// only
																							// once
																							// then
																							// show
																							// all
																							// after
																							// first
																							// occourance
			} else if (firstfoundAt < secondOccurance) {
				System.out.println("Output :" + firstString.substring(firstfoundAt + 1, secondOccurance)); // if
																											// String
																											// occoured
																											// second
																											// time
																											// then
																											// show
																											// inbetween
			}

		} else
			System.out.println("No character found");// No string found
	}

}
