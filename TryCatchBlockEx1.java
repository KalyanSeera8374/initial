package exceptionHandling;
import java.util.Scanner;
import java.io.*;
class Excep1{
	int a,b,c;
	Scanner scan = new Scanner(System.in);
	public void readE() {
		try {
			System.out.println("Enter the Value's of a and b:");
			a=scan.nextInt();
			b=scan.nextInt();
			c=a/b;
			System.out.println("Output: "+c);
		} catch (Exception e1) {
			System.out.println(e1);
		}
	}
}
public class TryCatchBlockEx1 {
	public static void main(String[] args) {
	System.out.println("Main Method:");
	Excep1 ex1 = new Excep1();
	ex1.readE();
	}
}