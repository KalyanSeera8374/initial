package threadingAndMultiThreading;
import java.util.Scanner;
public class ThreadingEx1 {
	public static void main(String[] args) throws Exception {
		System.out.println("Main Method:");
		int accno;
		int password;
		int balance = 50000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Number:");
		accno=sc.nextInt();
		System.out.println("Enter the Password:");
		password=sc.nextInt();
		Thread.sleep(3000);
		
		System.out.println("Your in the online Portal");
		if (balance>=0) {
			Thread.sleep(5000);
			System.out.println(balance);
		}
		System.out.println("Thank you.");
	}
}