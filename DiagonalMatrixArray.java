package arrays;
import java.util.Scanner;
class Diagonal{
	int i,j;
	int a[][] = new int[3][3];
	Scanner sc = new Scanner(System.in);
	public void read_dia() {
		System.out.println("Enter the Numbers:");
		for (i = 0; i <3; i++) {
			for (j = 0; j <3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}
	public void show_dia() {
		System.out.println("The Diagonal Matrix is:");
		for (i = 0; i <3; i++) {
			for (j = 0; j <3; j++) {
				if (i==j) {
					a[i][j] = a[i][j];
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

public class DiagonalMatrixArray {
	public static void main(String[] args) {
		System.out.println("The Two Dimensional Array:");
		Diagonal dar = new Diagonal();
		dar.read_dia();
		dar.show_dia();
	}
}
