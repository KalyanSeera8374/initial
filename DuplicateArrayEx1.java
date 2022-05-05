package arrays;
import java.util.Scanner;
public class DuplicateArrayEx1 {
	public static void main(String[] args) throws Exception {
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Duplicate Array:");
		 System.out.println("Enter the values:");
		 for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		 System.out.println();
		 System.out.println("original Array:");
		for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+",");	
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j <a.length; j++) {
				if (a[i]==a[j]) {
					a[j]=a[j+1];
				}
			}
		}
		System.out.println("Duplicates removed array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
	}
}