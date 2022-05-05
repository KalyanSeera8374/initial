package arrays;
import java.util.Scanner;
class Add_array{
	int i,j;
	int a[][] = new int[3][3];
	int b[][] = new int[3][3];
	int c[][] = new int[3][3];
	Scanner sc = new Scanner(System.in);
	public void read_add() {
		System.out.println("Enter the Element for the first matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the Element for the Second Matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array a matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("b Matrix:");//a[]={1,2,3,4,5,6,7};
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void show_add() {
		System.out.println("Addition of two matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
	}
}
public class AdditionTwoMatrixArray {
	public static void main(String[] args) {
		Add_array aa = new Add_array();
		aa.read_add();
		aa.show_add();
	}
}