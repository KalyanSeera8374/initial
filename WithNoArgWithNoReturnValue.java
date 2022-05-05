package methods;

import java.util.Scanner;

class Demo{
	int idno;
	String name;
	long phoneno;
	Scanner sc = new Scanner(System.in);
	
	public void read_data() {
		System.out.println("Enter idno,name,phoneno:");
	idno=sc.nextInt();
	name=sc.next();
	phoneno=sc.nextLong();
	}
	
	public void print_data() {
		System.out.println("Idno:"+idno);
		System.out.println("Name:"+name);
		System.out.println("Phoneno:"+phoneno);
	}
}

public class WithNoArgWithNoReturnValue {

	public static void main(String[] args) {
		Demo sai = new Demo();
		sai.read_data();
		sai.print_data();
	}
}
