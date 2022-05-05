package arrays;
import java.util.Scanner;

class Multiple_arr{
	int i,j;
	int a[][] = new int[3][3];
	int b[][] = new int[3][3];
	int c[][] = new int[3][3];
	Scanner sc = new Scanner(System.in);
	public void read_mul() {
		System.out.println("Enter the elements for the first matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements for the second matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				b[i][j] = sc.nextInt();
			}
		}
	}
	public void show_mul() {
		System.out.println("Multiplication of two matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
					
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class MultipleTwoMatrixArray {
public static void main(String[] args) {
	Multiple_arr ma = new Multiple_arr();
	ma.read_mul();
	ma.show_mul();
}
}
