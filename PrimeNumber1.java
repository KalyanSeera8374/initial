package Pattern;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n , i=2 ,c=2;
		System.out.println("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (i<n) {
			if (n%i==0) {
				c++;
			}
			i++;
		}
		if (c==2) {
			System.out.println("prime");
		} else {
System.out.println("not prime");
		}
		
		
		

	}

}
