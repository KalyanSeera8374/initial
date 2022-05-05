package polymorphism;
 
class Sub{
	int a,b;
	//Same method name but difference in parameters
	public void add(int a,int b) {
		int z=a+b;
		System.out.println("Addiction of Two Numbers: "+z);
	}
	public void add(int a,int b,int c) {
		int z=a+b+c;
		System.out.println("Addition of three Numbers: "+z);
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println("Method OverLoading:");
		Sub s=new Sub();
		s.add(34, 98,54);		
	}
}