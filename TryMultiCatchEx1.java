package exceptionHandling;
import java.util.Scanner;
import java.lang.*;
class Excep2{
	int a,b,c;
	String name ="kalyan";
	Scanner scan = new Scanner(System.in);
	public void readE2(){
		try {
			System.out.println("Enter the values of a and b");
			a=scan.nextInt();
			b=scan.nextInt();
			c=a/b;
			System.out.println(c);
			System.out.println(name.charAt(6));
		} catch (ArithmeticException a) {
			System.out.println(a);
		}
		catch (StringIndexOutOfBoundsException si) {
			System.out.println(si);
		}
		finally {
			System.out.println("This finally Block.");
		}
	}
}
public class TryMultiCatchEx1 {
	public static void main(String[] args) {
	System.out.println("Main Method:");
	Excep2 ex2 = new Excep2();
	ex2.readE2();
	}
}