package strings;

import java.util.Scanner;
class Reverse{
	String name;
	Scanner sc = new Scanner(System.in);
	public void readR() {
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println(name);
	}
	public void showR() {
		System.out.println("Reverse output:");
		for (int i = name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
	}
}
public class StringRevereOrder {
	public static void main(String[] args) {
		System.out.println("Main Method:");
		Reverse rev = new Reverse();
		rev.readR();
		rev.showR();
	}

}
