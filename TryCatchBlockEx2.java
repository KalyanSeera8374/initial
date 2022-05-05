package exceptionHandling;
import java.util.Scanner;
import java.io.*;
class ExcepE1{
	int a,b,c;
	Scanner scan= new Scanner(System.in);
	public void read() throws ArithmeticException{
		
		System.out.println("Enter the value's of a and b:");
		a=scan.nextInt();
		b=scan.nextInt();
		c=a/b;
		System.out.println(c);
		throw new ArithmeticException("ArithmeticException Occurred");  
//		System.out.println("Hi");
	}	
}
public class TryCatchBlockEx2 {
	public static void main(String[] args)throws ArithmeticException{
		System.out.println("Main Method:");
		ExcepE1 ec = new ExcepE1();
		ec.read();
	}
}