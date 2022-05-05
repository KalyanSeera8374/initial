package arrays;
import java.util.Scanner;
class Rev{
	int a[] = new int[10];
	int l=a.length,temp;
	Scanner sc = new Scanner(System.in);
	public void readR() {
		System.out.println("Enter the Values:");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Original Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
	}
	public void revR() {
		System.out.println();
		for (int i = 0; i <l/2; i++) {
			temp=a[i];
			a[i]=a[l-i-1];
			a[l-i-1]=temp;
		}
		System.out.print("Reversed Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
	}
}
public class ReverseArrayEx2 {
	public static void main(String[] args) {
		System.out.println("Main Method:");
		Rev rr = new Rev();
		rr.readR();
		rr.revR();
	}
}