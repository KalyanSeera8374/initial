package Demo;

import java.util.Scanner;

public class EvenOddWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        int n=num;
        i=0;
        while (i<=n && num>=0) {
			if(num%2==0) {
				System.out.println("Entered Number "+num+" is "+"Even");
			}
			else {
				System.out.println("Entered Number "+num+" is "+"Odd");
			}
			num = num-2;
			i++;
		}
	}
}
