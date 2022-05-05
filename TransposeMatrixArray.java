package arrays;
import java.util.Scanner;
class Transpose{
	int i,j;
	int a[][] = new int[3][3];
	int b[][] = new int[3][3];
	Scanner sc = new Scanner(System.in);
	public void read_tra() {
		System.out.println("Enter the Element's for the Matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}
	public void show_tra() {
		System.out.println("Transpose Matrix Array:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				b[i][j] = a[j][i];
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
	}
}
public class TransposeMatrixArray {
	public static void main(String[] args) {
		Transpose tm = new Transpose();
		tm.read_tra();
		tm.show_tra();
	}
}