package abstractEx;

interface Interf{
	public void Method();  
}
abstract class Abst implements Interf{
      Abst(){
		System.out.println("This is Constructor in the abstract Class.");
	}
	abstract void show();
}
class Demo extends Abst{
	void show() {
		System.out.println("This is Show method from Abstract Class which is extended to class Demo.");
	}
	public void Method() {
	System.out.println("This is the Method from the Interface Class.");	
	}
}
public class AbstractEx3 {
	public static void main(String[] args) {
		System.out.println("Main Method:");
		Demo d = new Demo();
		d.show();
		d.Method();
	}
}