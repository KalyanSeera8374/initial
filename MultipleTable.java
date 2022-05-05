package Pattern;

import java.util.Scanner;

public class MultipleTable {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int n ;
		System.out.println("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=12; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
	
	}
}
