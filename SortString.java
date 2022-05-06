package strings;
import java.util.Scanner;
class Sort{
	String Name[]= new String[100];
	public void readSS(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+n+" Strings:");
		for (int i = 0; i <n; i++) {
			Name[i]=sc.next();
		}
	}
	public void showSS(int n) {
		System.out.println("Before Sorting the Names:");
		for (int i = 0; i < n; i++) {
			System.out.println(Name[i]);
		}
	}
	public void sortSS(int n) {
		String temp="";
		for (int i = 0; i <n; i++) {
			for (int j = i+1; j <n; j++) {
				if (Name[i].compareTo(Name[j])>0) {
					temp=Name[i];
					Name[i]=Name[j];
					Name[j]=temp;
				} 
			}
		}
	}
	public void displaySS(int n) {
		System.out.println("After Sorting the Names:");
		for (int i = 0; i < n; i++) {
			System.out.println(Name[i]);
		}
	}
}
public class SortString {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Method:");
		System.out.println("enter Number of Strings:");
		num=sc.nextInt();
		Sort sss=new Sort();
		sss.readSS(num);
		sss.showSS(num);
		sss.sortSS(num);
		sss.displaySS(num);
	}
}
