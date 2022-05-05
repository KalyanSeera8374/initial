package arrays;

import java.util.Scanner;

import practicepackage.PracticeArrays;

class Practice {
	int n = 3;
	int a[][] = new int[n][n];
	int b[][] = new int[n][n];
	int c[][] = new int[n][n];
	Scanner sc = new Scanner(System.in);

	public void readPA() {
		System.out.println("Enter the First Array Elements:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("First Array Was Completed.");
		System.out.println("Enter the Second Array Elements:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Second Array was completed.");
		System.out.println("First Array:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("Second Array:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
	}

	public void addPA() {
		System.out.println("Multiplication of Two Array Matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					c[i][j] += a[i][k] * b[j][k];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class PraticeArray {
	public static void main(String[] args) {
		System.out.println("Main Method:");
		Practice PA = new Practice();
		PA.readPA();
		PA.addPA();
	}
}
