package Demo;

import java.util.Scanner;

public class EvenOddWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,count=0,z=0;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        int n=num;
        i=0;
        while (i<=n && num>=0) {
			if(num%2==0) {
				count = count+1;
//				System.out.println("Entered Number "+num+" is "+"Even");
			}
			else {
				z = z+1;
//				System.out.println("Entered Number "+num+" is "+"Odd");
			}
			num--;
			i++;
		}
        System.out.println("From 0 to "+n+" there are "+count+" Even numbers are they and "+z+" Odd Numbers are they.");
	}
}
