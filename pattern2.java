package Demo;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i;
	System.out.println("Enter a number:");
	Scanner sc = new Scanner(System.in);
	i =sc.nextInt();
	if (i%2==0) {
		System.out.println("Even number");
	}
	else {
		System.out.println("Odd Number");
	}
	}
}
