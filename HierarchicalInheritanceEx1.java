package inheritance;
class Declare{
	int a,b;
	Declare(int x,int y){
		a=x;
		b=y;
	}
	public void showD() {
		System.out.println(a);
		System.out.println(b);
	}
}
class Print1 extends Declare{
	Print1(int x,int y){
		super(x,y);
	}
	public void display(int c) {
		System.out.println(c);
	}
}
class Print2 extends Declare{
	Print2(int x ,int y){
		super(x,y);
	}
	public void display(int c) {
		System.out.println(c);
	}
}
public class HierarchicalInheritanceEx1 {
	public static void main(String[] args) {
		System.out.println("Hierarchical Inheritance:");
		System.out.println("Main Method:");
		Print1 p = new Print1(3,7);
		p.showD();
		p.display(9);
		Print2 pp = new Print2(12,15);
		pp.showD();
		pp.display(20);
	}
}