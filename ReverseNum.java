package Demo;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,rem,rev=0;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		i=num;
		while (num!=0) {
			rem = num%10;
			rev = (rev*10)+rem;
			num = num/10;
		}
		System.out.println("Reverse of the given Number "+i+" is "+rev);
	}
}
