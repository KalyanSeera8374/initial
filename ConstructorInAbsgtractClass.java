package abstractEx;
import java.util.Scanner;
abstract class Abs1{
	static {
		System.out.println("This is Static Block in the Abstract Classs");
	}
	Abs1(int a ,int b){
		int z = a+b;
		System.out.println("This is Constructor in the Abstract class.");
		System.out.println(z);
	}
	Abs1(){
		System.out.println("Thsi Default Constructor in Abstract Class.");
	}
}
class Sub1 extends Abs1{
	Sub1(){
//		super();
		System.out.println("This is Default Constructor:");
	}
	Sub1(int a,int b){
		super(a , b);
	}
}
public class ConstructorInAbsgtractClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Variables of A and B");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("This is Main Method:");
		new Sub1(x,y);
		new Sub1();
		
	}
}