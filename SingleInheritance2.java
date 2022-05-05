package inheritance;
class Addiction{
	int a =10;
	int b=44;
	public void add() {
		int c=a+b;
		System.out.println("Addiction of Two numbers is "+c);
		}
}
class Multiple extends Addiction{
	public void mul() {
		int c = a*b;
		System.out.println("Multiplication of two Numbers is "+c);
	}
}
public class SingleInheritance2 {
	public static void main(String[] args) {
		System.out.println("Single Inheritance:");
		Multiple mu = new Multiple();
		mu.add();
		mu.mul();
	}
}