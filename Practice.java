package inheritance;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		System.out.println("Main Method:");
			String name;
			String v="v";
			Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Name:");
				name = sc.next();
				String temp =v;
				if (temp==name){
					System.out.println("Match");
				} else {
					System.out.println("Not Match");
				}
			
		
	}
}