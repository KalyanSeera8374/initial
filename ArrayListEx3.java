package arrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx3 {
	public static void main(String[] args) {
		int n;
		String s = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		n = sc.nextInt();
		ArrayList al3 = new ArrayList();
		System.out.println("Enter the Elements:");
		for (int i = 0; i < n; i++) {
			s = sc.next();
			al3.add(s);
		}
		Collections.sort(al3);
		System.out.println("After Sorting the Array List:");
		System.out.println(al3);
	}
}