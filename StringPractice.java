package strings;
import java.util.Scanner;
class Login{
	final int id=459;
	final String password="Marolix88";
	Scanner sc = new Scanner(System.in);
	public void read() {
		int tid;
		String tpassword;
		System.out.println("Enter the id Number:");
		tid=sc.nextInt();
		System.out.println("Enter the Password:");
		tpassword=sc.next();
		if (password.compareTo(tpassword)==0) {
			System.out.println("Welcom to Marolix");
		}
		else {
			System.out.println("Wrong id or Password.");
		}
	}
}
public class StringPractice {
	public static void main(String[] args) {
	System.out.println("Main Method:");	
	Login l = new Login();
	l.read();
	}
}