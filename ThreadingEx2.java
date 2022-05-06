package threadingAndMultiThreading;
class MyThreadEx2 extends Thread{
	public void run() {
		System.out.println("Running......");
	}
}
public class ThreadingEx2 {
	public static void main(String[] args) {
		System.out.println("Main Method:");
		MyThreadEx2 my = new MyThreadEx2();
		my.start();
	}
}
