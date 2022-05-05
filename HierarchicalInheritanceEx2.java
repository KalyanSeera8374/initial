package inheritance;
import java.util.Scanner;
class Var{
	int x,y;
	Scanner scan = new Scanner(System.in);
	Var(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void Show() {
		System.out.println(x);
		System.out.println(y);
	}
}
class AddV extends Var{
	AddV(int x,int y){
		super(x,y);
	}
	
}
public class HierarchicalInheritanceEx2 {
	public static void main(String[] args) {
	}
}