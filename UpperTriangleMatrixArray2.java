package arrays;
import java.util.Scanner;
class Upper_tri2{
	int i,j;
	int a[][] = new int[3][3];
	Scanner sc = new Scanner(System.in);
	public void read_upp() {
		System.out.println("Enter the Element for the Matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}
	public void show_upp() {
		System.out.println("Upper Triangle Matrix Array:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (j<i) {
					System.out.print(" "+a[i][j]);
				} else {
					a[i][j]=0;
					System.out.print(" "+a[i][j]);
				}
			}
			System.out.println();
		}
	}
}

public class UpperTriangleMatrixArray2 {
	public static void main(String[] args) {
		Upper_tri2 upp = new Upper_tri2();
		upp.read_upp();
		upp.show_upp();
	}
}
