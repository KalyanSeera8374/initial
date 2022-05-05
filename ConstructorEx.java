package constructor;
class Sub{
	Sub(){
		int a=34,b=59,c;
		c =a+b;
		System.out.println("This is Constructor:");
		System.out.println(c);
	}
}
public class ConstructorEx {
	public static void main(String[] args) {
		System.out.println("This is Main Method:");
		new Sub();//We can Call without any reference variable.
	}
}