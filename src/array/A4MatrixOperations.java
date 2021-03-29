package array;

import java.util.Scanner;

public class A4MatrixOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number Of Rows");
		int iRow = sc.nextInt();

		System.out.println("Enter The Number Of Rows");
		int iCol = sc.nextInt();

		sc.close();

		// initialize the matrix with given inputs
		int[][] iMatrix = new int[iRow][iCol];
		int[][] iTranspose = new int[iCol][iRow];

		// Reading use input for matrix
		System.out.println("Enter The Data For Matrix :");
		for (int i = 0; i < iRow; i++) {
			for (int j = 0; j < iCol; j++) {
				iMatrix[i][j] = sc.nextInt();
			}
		}

		// Printing original matrix in table format
		System.out.println("Your Matrix is :");

		for (int i = 0; i < iRow; i++) {
			for (int j = 0; j < iCol; j++) {
				System.out.print(iMatrix[i][j] + " ");
			}
			System.out.println();
		}

		/// transpose of the original matrix
		for (int i = 0; i < iRow; i++) {
			for (int j = 0; j < iCol; j++) {
				iTranspose[j][i] = iMatrix[i][j];
			}
		}

		System.out.println("Output is :");

		for (int i = 0; i < iRow; i++) {
			for (int j = iCol - 1; j >= 0; j--) {
				System.out.print(iTranspose[i][j] + " ");
			}
			System.out.println();
		}
	}

}
