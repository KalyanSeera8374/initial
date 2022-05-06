package threadingAndMultiThreading;
class Multithread extends Thread{
	public void run() {
		System.out.println("Mythread is Running....");
	}
}
class Multithread1 extends Thread{
	public void run() {
		System.out.println("Mythread1 is Running........");
	}
}
public class MultiThreading {
	public static void main(String[] args) {
		System.out.println("Main Method:");
		Multithread mt = new Multithread();
		Multithread1 mt1 = new Multithread1();
		mt.start();
		mt1.start();
	}
}