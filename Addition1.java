package Demo;

import java.util.Scanner;

public class Addition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int z;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = x+y;
		System.out.println("The Addition of numbers is:"+z );
		z = x-y;
		System.out.println("The Subtraction of number is:"+z);
		z = x*y;
		System.out.println("The Multiplication of number is:"+z);
		z = x/y;
		System.out.println("The Division of number is:"+z);
		sc.close();
		

	}

}
