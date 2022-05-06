package strings;
import java.util.Scanner;
class Palindrome{
	String word;
	String temp="";
	Scanner sc = new Scanner(System.in);
	public void readP() {
		System.out.println("Enter the Word:");
		word=sc.next();
		for (int i =word.length()-1; i>=0; i--) {
			temp+=word.charAt(i);
		}
		if(temp.equals(word)) {
			System.out.println(word+" is a Palindrome.");
		}
		else {
			System.out.println(word+" is not a Palindrome.");
		}
	}
}

public class StringPalindrome {
	public static void main(String[] args) {
		System.out.println("Main Method:");
		Palindrome p = new Palindrome();
		p.readP();
	}
}