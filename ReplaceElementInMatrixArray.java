package arrays;
import java.util.Iterator;
import java.util.Scanner;
class Replace{
	int i,j;
	int a[][] = new int[3][3];
	Scanner sc = new Scanner(System.in);
	public void read_rp() {
		System.out.println("Enter the elements of the matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}
	public void show_rp() {
		System.out.println("The Matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
	public void replace_rp() {
		System.out.println("Enter the position of element:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(a[x][y]+" is in the position("+x+","+y+")");
		System.out.println("Enter the replace element:");
		a[x][y] = sc.nextInt();
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}

public class ReplaceElementInMatrixArray {
	public static void main(String[] args) {
		System.out.println("Two Dimensional Array:");
		Replace rrr = new Replace();
		rrr.read_rp();
		rrr.show_rp();
		rrr.replace_rp();
	}
}