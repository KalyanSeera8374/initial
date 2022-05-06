package threadingAndMultiThreading;
import java.util.Scanner;
class MulThread11 implements Runnable{
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
class Multhread21 implements Runnable{
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
class MulThread31 implements Runnable{
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
public class MultiThreadingEx2 {
	public static void main(String[] args) throws Exception {
		System.out.println("Main Method:");
		MulThread11 md1= new MulThread11();
		Multhread21 md2 = new Multhread21();
		MulThread31 md3 =new MulThread31();
		Thread t1 = new Thread(md1);
		Thread t2 = new Thread(md2);
		Thread t3 = new Thread(md3);
//		System.out.println("t1"+t1.isAlive());
//		System.out.println(t2.isAlive());
//		System.out.println(t3.isAlive());
		t1.start();
		t1.join();
		t2.start();
		t3.start();
//		System.out.println(t1.isAlive());
//		System.out.println(t2.isAlive());
//		System.out.println(t3.isAlive());
		
//		t2.join();
//		t3.join();
	}
}