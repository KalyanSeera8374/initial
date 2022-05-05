package arrays;

import java.util.Scanner;

class SumEvenOdd{
	int i,j,sume,sumo;
	int a[] =new int[10];
	Scanner sc = new Scanner(System.in);
	public void read_eo() {
		System.out.println("Enter the numbers:");
		for (i = 0; i <10; i++) {
			a[i] = sc.nextInt();
		}
	}
		public void show_eo() {
		for (j = 0; j <10; j++) {
			if (a[j]%2==0) {
				sume +=a[j];
			} 
			else {
				sumo +=a[j];
			}
		}
		System.out.println("Sum of Even numbers:"+sume);
		System.out.println("Sum of Odd numbers:"+sumo);
	}
}

public class SumOfEvenAndOddIndexNum {
	public static void main(String[] args) {
	System.out.println("One Deminsional array:");
	SumEvenOdd seo = new SumEvenOdd();
	seo.read_eo();
	seo.show_eo();
	}
}