package exceptionHandling;
import java.io.*;
class Excep{
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
public class TryCatchBlocks {
	public static void main(String[] args) {
	System.out.println("Main Method:");
	Excep ex = new Excep();
	ex.read();
	}
}