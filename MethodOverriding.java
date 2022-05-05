package polymorphism;
class Parent{
	public void add() {
		System.out.println("Parent class");
	}
}
class Child extends Parent{
	public void add() {
		System.out.println("child Class");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		System.out.println("Method Overriding:");
		Child ch = new Child();
		ch.add();
	}
}
