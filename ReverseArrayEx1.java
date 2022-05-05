package arrays;
import java.util.Scanner;
public class ReverseArrayEx1 {
//Swapping the Values in the values in the array for reversing the array elements.
	public static void main(String[] args) {
		int a[]=new int[10];
		int temp;
		int l=a.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Original Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
		for (int i = 0; i <l/2; i++) {
				temp=a[i];
				a[i]=a[l-i-1];
				a[l-i-1]=temp;
		}
		System.out.println();
		System.out.println("Reverse Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(+a[i]+",");
		}
	}
}