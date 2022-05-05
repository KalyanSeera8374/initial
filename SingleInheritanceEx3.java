package inheritance;
import java.util.Scanner;
class Student {
	int sid; 
	String sname;
	public void sread() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Student ID and Student Name:");
		sid = scan.nextInt();
		sname = scan.next(); 
	}
	public void sshow() { 
		System.out.println("Student ID: "+sid);
		System.out.println("Student Name: "+sname);
	}
}
class Result extends Student{
	int sub1,sub2,sub3,total,avg;
	Scanner sc = new Scanner(System.in);
	public void sread1() {
		super.sread();
		System.out.println("Enter the Sub1 sub2 and sub3 marks:");
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
	}
	public void sshow1() {
		super.sshow();
		total=sub1+sub2+sub3;
		avg = total/3;
		System.out.println("Total marks are "+total);
		System.out.println("Average is "+avg);
	}
}
public class SingleInheritanceEx3 {
	public static void main(String[] args) {
		System.out.println("Single Inheritance:");
		Result rrr = new Result();
		rrr.sread1();
		rrr.sshow1();
	}
}