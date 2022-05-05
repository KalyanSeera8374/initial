 package arrays;
import java.util.Scanner;
class Upper_tri{
	int i,j;
	int a[][] = new int[3][3];
	Scanner sc = new Scanner(System.in);
	public void read_upp() {
		System.out.println("Enter the Numbers:");
		for (i = 0; i <3; i++) {
			for (j = 0; j <3; j++) {
				a[i][j] =sc.nextInt();
			}
		}
	}
	public void show_upp() {
		System.out.println("Upper Triangle Matrix:");
		for (i = 0; i <3; i++) {
			for (j = 0; j<3; j++) {
				if (j>=i) {
					a[i][j] = a[i][j];
					System.out.print(" "+a[i][j]);
				}
				else {
					a[i][j] =0;
					System.out.print(" "+a[i][j]);
				}
			}
			System.out.println();
		}
	}
}

public class UpperTriangleMatrixArray {
	public static void main(String[] args) {
		System.out.println("The Two Dimensional Array:");
	Upper_tri upt = new Upper_tri();
	upt.read_upp();
	upt.show_upp();
	}
}
