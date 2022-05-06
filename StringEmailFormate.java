package strings;
import java.util.Scanner;
class Email{
	String mail;
	Scanner sc = new Scanner(System.in);
	public void readE() {
		System.out.println("Enter the mail id:");
		mail=sc.next();
		System.out.println(mail.indexOf("@"));
		if(mail.indexOf("@")==-1) {
			System.out.println("Not Vaild");
		}
		else {
			System.out.println("Vaild");
		}
	}
}
public class StringEmailFormate {
	public static void main(String[] args) {
	System.out.println("Main Method:");
	Email em = new Email();
	em.readE();
	}
}