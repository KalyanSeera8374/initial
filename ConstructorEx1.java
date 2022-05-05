package constructor;
class Add {
	int a =10;
	int b= 25;
	Add(){
		
		int c = a+b;
		System.out.println("This is Constructor Method.");
		System.out.println(c);
	}
	void Mul(){
		int z=a*b;
		System.out.println("This is Method in the class");
		System.out.println(z);
	}
}

public class ConstructorEx1 {
	public static void main(String[] args) {
	System.out.println("This is Main Method.");
	Add ca=new Add();
	ca.Mul();
	}
}