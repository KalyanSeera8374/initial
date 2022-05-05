package arrays;
import java.util.Scanner;
class TwoDimArray{
	int i,j;
	int a[][] = new int[3][3];
	Scanner sc = new Scanner(System.in);
	public void read_td() {
		System.out.println("Enter the numbers:");
		for (i = 0; i <3; i++) {
			for (j = 0; j <3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}
	public void show_td() {
		System.out.println("The Matrix is:");
		for (i = 0; i <3; i++) {
			for (j = 0; j <3; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}	
	}
}

public class TwoDimensionalArray {
	public static void main(String[] args) {
		System.out.println("Two Dimensional Array:");
		TwoDimArray tda = new TwoDimArray();
		tda.read_td();
		tda.show_td();
	}
}
