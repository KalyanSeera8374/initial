package arrays;
import java.util.Scanner;

class AscDes{
	int i,j,temp;
	int a[] = new int[10];
	Scanner sc = new Scanner(System.in);
	public void read_ad() {
		System.out.println("Enter the number:");
		for (i = 0; i <10; i++) {
			a[i] = sc.nextInt();
		}
	}
	public void show_asc() {
		System.out.println("Ascending order:");
		for (i = 0; i <10; i++) {
			for (j = i+1; j <10; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (j = 0; j <10; j++) {
			System.out.print(a[j]+",");
		}
		System.out.println();
	}
	public void show_des() {
		System.out.println("Descending order:");
		temp=0;
		for (i = 0; i <10; i++) {
			for (j = i+1; j <10; j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (j = 0; j <10; j++) {
			System.out.print(a[j]+",");
		}
	}
}

public class AscendingDescendingOrder {
	public static void main(String[] args) {
		System.out.println("One Deminsional Array:");
		AscDes ad = new AscDes();
		ad.read_ad();
		ad.show_asc();
		ad.show_des();
	}
}