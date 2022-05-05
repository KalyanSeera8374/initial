package Demo;

import java.util.Scanner;

public class EvenOddWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num;
          System.out.println("Enter the Number:");
          Scanner sc = new Scanner(System.in);
          num = sc.nextInt();
          sc.close();
          i=1;
          while (i<=1) {
			if(num%2==0) {
				System.out.println("Entered Number "+num+" is "+"Even");
			}
			else {
				System.out.println("Entered Number "+num+" is "+"Odd");
			}
			i++;
		}
	}

}
