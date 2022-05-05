package exceptionHandling;
import java.io.*;
class ExcepN{
	int a=100,b=0,c;
	public void read() {
		try {
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class NullPointerExceptionEx1 {
	public static void main(String[] args) {
		ExcepN ee = null;
		
		try {
			ee.read();
		} catch (NullPointerException n) {
		System.out.println("This is null pointer Exception "+n);
		}
	}
}