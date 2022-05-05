package Pattern;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,c=0;
		System.out.println("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		i=1;
		while(i<=n) {
			if(n%i==0) {
				c++;
			}
			i++;
		}
		if(c==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
