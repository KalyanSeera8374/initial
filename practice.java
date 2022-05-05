package Demo;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		int i, num, sum = 0, rem, temp, power = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();
		temp = num;
		while (temp > 0) {
			temp /= 10;
			power++;
		}
		temp = num;
		while (temp > 0) {
			rem = temp % 10;
			sum += Math.pow(rem, power);
			temp /= 10;
			System.out.println(sum);
		}
		if (sum == num) {
			System.out.println("The Number is Armstrong number.");
		} else {
			System.out.println("The number is not Armstrong number.");
		}
	}
}
