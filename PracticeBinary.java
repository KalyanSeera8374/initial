package arrays;
import java.util.Scanner;
class ArrayAdd{
	int n=3;
	int a[][]=new int[n][n];
	int b[][]=new int[n][n];
	int c[][] =new int[n][n];
	Scanner sc = new Scanner(System.in);
	public void readAA() {
		System.out.println("Enter the First array Elements:");
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The First Arrays Completed.");
		System.out.println("Enter the second Array Elements:");
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Second Array Completed.");
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				System.out.print(b[i][j]+" ");
			}System.out.println();
		}
	}
	public void arrayadd() {
		System.out.println("Addition of two arrays.");
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Output:");
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				System.out.print(c[i][j]+" ");
			}System.out.println();
		}
	}
}
public class PracticeBinary {
	public static void main(String[] args) {
		System.out.println("Main Method:");
		ArrayAdd aa= new ArrayAdd();
		aa.readAA();
		aa.arrayadd();
	}
}
/*
 * 		int num=0,a=10,b=20;
		System.out.println(num==0?1:0);//true =1 ,false=0
		System.out.println((a>b)?a:b);
 */