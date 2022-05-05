package Demo;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,factorial=1,z;
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		z=num;
		i=1;
		while (i<=z) {
			factorial = factorial*num;
			i++;
			num--;
		}
		System.out.println("The Factorial of the Number "+z+" is "+factorial);
	}

}
