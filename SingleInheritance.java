package inheritance;
class Parent{
	public void land() {
		System.out.println("Parent brought the land.");
	}
}
class Child extends Parent{
	public void house() {
		System.out.println("Build the house on the parent land");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		System.out.println("Single Inheritance:");
		Child ch = new Child();
		ch.land();
		ch.house();
	}
}