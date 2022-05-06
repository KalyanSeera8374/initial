package strings;
import java.util.Scanner;
public class StringBuilderEx3 {
	public static void main(String[] args) {
		System.out.println("Main Method:");
		String s=" ";
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the Sencetance:");
		s=sc.next();
		StringBuilder stb = new StringBuilder();
		System.out.println(stb.length());
		for (int i = 0; i < stb.length(); i++) {
			if (stb.charAt(i)!=' '||stb.charAt(i)!='.') {
				System.out.print(stb.charAt(i));
			}
			System.out.println(i);
		}
	}
}