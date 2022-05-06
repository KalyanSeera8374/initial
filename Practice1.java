package threadingAndMultiThreading;
class Bike extends Thread{
	public void run() {
		System.out.println("Ridding "+Thread.currentThread().getPriority());
	}
}
class Car extends Thread{
	public void run() {
		System.out.println("Driving "+Thread.currentThread().getPriority());
	}
}
class Van extends Thread{
	public void run() {
		System.out.println("Van Drivind... "+Thread.currentThread().getPriority());
	}
}
public class Practice1 {
	public static void main(String[] args) {
		System.out.println("Main Method:");
		Bike b=new Bike();
		b.setPriority(10);
		b.start();
		Car c= new Car();
		c.setPriority(c.MIN_PRIORITY);
		c.start();
		Van v = new Van();
		v.start();
	}
}