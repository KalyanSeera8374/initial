package polymorphism;
class Vehicle{
	public void run() {
		System.out.println("Vehicle is Running.");
	}
}
class Bike extends Vehicle{
	public void run() {
		System.out.println("Bike is Running.");
	}
}
public class MethodOverriding2 {
	public static void main(String[] args) {
		System.out.println("Method Overriding:");
		Bike b = new Bike();
		b.run();
	}
}