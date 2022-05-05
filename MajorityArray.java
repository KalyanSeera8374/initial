package arrays;
import java.util.Scanner;
public class MajorityArray {

	public static void main(String[] args) {
	int n,count=0;
	System.out.println("Enter the Number:");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the array Element:");
	for (int i = 0; i <n; i++) {
		a[i]=sc.nextInt();
	}
	for (int i = 0; i <n; i++) {
	for (int j = 0; j <n; j++) {
		if (a[i]==a[j]) {
			count++;
			if (count>((double)n/2)) {
				System.out.println("  1");
			}
			else {
				System.out.println("-1");
			}
		} 
	}
	}
	}

}
