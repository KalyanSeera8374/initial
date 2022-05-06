package threadingAndMultiThreading;
class MyThreadEx3 extends Thread{
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("Thread is Running...."+Thread.currentThread().getName());
		}
	}
}
public class ThreadingEx3 {
	public static void main(String[] args) {
		System.out.println("Main Method:");
		MyThreadEx3 mt1 = new MyThreadEx3();
		mt1.setName("mt1");
		mt1.start();
		MyThreadEx3 mt2 = new MyThreadEx3();
		mt2.setName("mt2");
		mt2.start();
	}
}