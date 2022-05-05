package arrays;

import java.util.Scanner;

class Onedim{
	int i;
	int a[] = new int[10];
	Scanner sc = new Scanner(System.in);
	public void read_data() {
		System.out.println("Enter the numbers:");
		for (i = 0; i <10; i++) {
			a[i] = sc.nextInt();
		}
	}
	public void show_data() {
		System.out.println("Output:");
		for (i = 0; i <10; i++) {
			System.out.println(a[i]);
		}
	}
}

public class OneDimensionalArray {
	public static void main(String[] args) {
		Onedim da = new Onedim();
		da.read_data();
		da.show_data();
	}
}
