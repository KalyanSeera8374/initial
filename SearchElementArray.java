package arrays;
import java.util.Scanner;
class Search{
	int temp;
	int a[][]=new int[3][3];
	Scanner scan = new Scanner(System.in);
	public void readS() {
		System.out.println("Enter the Array elements:");
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <3; j++) {
				a[i][j]=scan.nextInt();
//				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void showS() {
		System.out.println("Enter the Values to Search:");
		temp=scan.nextInt();
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <3; j++) {
				if (a[i][j]==temp) {
					System.out.println("The Search value "+temp+" is in the position ("+i+","+j+").");
				}
			}
		}
	}
}
public class SearchElementArray {
	public static void main(String[] args) {
		System.out.println("Search Element in Array:");
		Search sh = new Search();
		sh.readS();
		sh.showS();
	}
}