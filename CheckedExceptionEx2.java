package exceptionHandling;
import java.io.*;
public class CheckedExceptionEx2 {
	public static void main(String[] args) throws IOException{//Exception
		System.out.println("Main method:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Name:");
			String name = br.readLine();
			System.out.println(name);
	}
}