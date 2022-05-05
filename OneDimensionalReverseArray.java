package arrays;

import java.util.Scanner;

class Reverse{
	int i;
	int a[] = new int[10];
	Scanner sc = new Scanner(System.in);
	public void Read_ra() {
		System.out.println("Enter the Numbers:");
		for (i = 0; i <10; i++) {
			a[i] = sc.nextInt();
		}
	}
	public void Rev_ra() {
		System.out.println("Output:");
		for (i = 9;i>=0; i--) {
			System.out.println(a[i]);
		}
	}
}

public class OneDimensionalReverseArray {
	public static void main(String[] args) {
	Reverse reva = new Reverse();
	reva.Read_ra();
	reva.Rev_ra();
	}
}
