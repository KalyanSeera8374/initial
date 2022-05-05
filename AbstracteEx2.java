package abstractEx;
abstract class A{ 
	int a;
// abstract class
	abstract void a();
	int b(int a) {
		this.a =a;
		System.out.println(a);
		return a;
	     }
	abstract int c(int ca);
} 
abstract class B extends A{
	@Override
	void a() {
		System.out.println("a inside B");	
	}
  }
 class C extends B{ //concrete class 
	@Override
	 public int c(int ca) {
		System.out.println(ca);
		return ca;	
	}	
}
public class AbstracteEx2 { 
	public static void main(String[] args) {
		C cc = new C();
		cc.a();
		cc.b(10);
		cc.c(22);
	}
}