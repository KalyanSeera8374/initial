package methods;
import java.util.Scanner;
class Details{
	int idno;
	String name;
	float salary;
	
	public void read_data(int a,String b,float c) {
		idno = a;
		name = b;
		salary = c;
	}
	
	public void print_data() {
		System.out.println("Idno:"+idno);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
	}
}

public class WithArgsWithNoReturnValues {
	public static void main(String[] args) {
		int p;
		String q;
		float r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter idno,name,salary");
		p=sc.nextInt();
		q=sc.next();
		r = sc.nextFloat();
		Details d = new Details();
		d.read_data(p, q, r);
		d.print_data();
	}
}
