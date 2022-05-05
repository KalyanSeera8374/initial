package arrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListEx2 {
	public static void main(String[] args) {
		int n;
		String s = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		n = sc.nextInt();
		ArrayList al = new ArrayList();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the Charactor:");
			s = sc.next();
			System.out.println(s);
			al.add(s);
		}
		System.out.println("Output:");
		System.out.println(al);
	}
}