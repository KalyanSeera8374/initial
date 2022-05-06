package threadingAndMultiThreading;
import java.util.Scanner;
class MulThread1 extends Thread{
	int accno;
	int password;	
	public void run()  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Number:");
		accno=sc.nextInt();
	System.out.println("Enter the password:");
	password=sc.nextInt();
		try {
		Thread.sleep(5000);
		System.out.println("Your is the online portal.");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
class Multhread2 extends Thread{
	public void run() {
		int balance=50000;
		try {
		if (balance>0) {
				Thread.sleep(3000); 
				System.out.println("Balance is :"+balance);
			} 
			
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class MulThread3 extends Thread{
	public void run() {
		try {
		Thread.sleep(2000);
		System.out.println("This is Axis Bank.");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
public class MultiThreadingEx1 {
	public static void main(String[] args) throws Exception {
		System.out.println("Main Method:");
		MulThread1 md1= new MulThread1();
		Multhread2 md2 = new Multhread2();
		MulThread3 md3 =new MulThread3();
		md1.start();
		md2.start();
		md3.start();

	}
}