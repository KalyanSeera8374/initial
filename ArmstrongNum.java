package Demo;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,rev,rem,z;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		z=0;
		i=0;
		while (i<=num) {
			rem = num%10;
			System.out.println(rem+"*");
			z = (rem*rem*rem)+z;
			System.out.println(rem);
			num = num/10;
			i++;
		}
		System.out.println(z);
	}
}
