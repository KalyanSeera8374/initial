package Demo;

import java.util.Scanner;

public class Mulit {

	public static void main(String[] args) {
		int i,j;
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		
		j = sc.nextInt();
		sc.close();
		i=1;
		while (i<=15) {
			System.out.println(j+"*"+i+"="+(i*j));	
			i++;
		}

	}

}
