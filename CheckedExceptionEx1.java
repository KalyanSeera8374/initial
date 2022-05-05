package exceptionHandling;
import java.io.*;
public class CheckedExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("Main method:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Name:");
		try {
			String name = br.readLine();
			System.out.println(name);
		} catch (Exception e) {
	System.out.println(e);
		}
	}
}