package polymorphism;

class Data{
	public int Add(int a,int b) {
		int s = a+b;
		return s;
	}
	public double Add(double a ,double b) {
		double s = a+b;
		return s;
	}
}
public class MethodOverloading2 {
	public static void main(String[] args) {
		System.out.println("Method Overloading:");
		Data d = new Data();
		System.out.println(d.Add(45, 345));
		System.out.println(d.Add(3.68,66.28));
	}
}
