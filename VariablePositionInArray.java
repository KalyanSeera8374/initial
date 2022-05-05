package arrays;

import java.util.Scanner;

class Position{
	int i ;
	int a[] = new int[10];
	Scanner sc = new Scanner(System.in);
	public void read_p() {
		System.out.println("Enter the numbers:");
		for (i = 0; i <10; i++) {
			a[i] = sc.nextInt();
		}
	}
	public void Variable_p() {
		int temp;
		System.out.println("Enter the search element:");
		temp = sc.nextInt();
		for (i = 0; i <10; i++) {
			if (a[i]==temp) {
				System.out.println("The variable is "+a[i]+" and the position is "+i+".");
			}
		}
	}
}

public class VariablePositionInArray {
	public static void main(String[] args) {
		System.out.println("One Dimensional Array:");
		Position vp = new Position();
		vp.read_p();
		vp.Variable_p();
	}
}
