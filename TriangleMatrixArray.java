package arrays;

import java.util.Scanner;
class Right_tri{
	int i,j;
	int a[][] = new int[3][3];
	Scanner sc = new Scanner(System.in);
	public void read_tri() {
		System.out.println("Enter the Numbers:");
		for (i = 0; i <3; i++) {
			for (j = 0; j <3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}
	public void show_tri() {
		System.out.println("The Right Triangle Matrix:");
		for (i = 0; i <3; i++) {
			for (j = 0; j<3; j++) {
				if (j<=i) {
					a[i][j]=a[i][j];
					System.out.print(" "+a[i][j]);
				}
				else {
					a[i][j]=0;
					System.out.print(" "+a[i][j]);
				}
			}
			System.out.println();
		}
	}
}

public class TriangleMatrixArray {
	public static void main(String[] args) {
		System.out.println("The Two Dimensional Array:");
		Right_tri rt = new Right_tri();
		rt.read_tri();
		rt.show_tri();
	}
}
