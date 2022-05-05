package inheritance;

import java.util.Scanner;
class StudentL {
	int n=1;
	int sid =400;
	String sname;
	String exit;
	Scanner scan = new Scanner(System.in);
	public void sread() {
		System.out.println("Enter the Student Name:");
		sname = scan.next();
		if(sname=="exit") {
			
		}
		System.out.println(n);
	}
	
	public void sshow() {
		System.out.println("Student ID: "+sid);
		System.out.println("Student Name: "+sname);
	}
}

class ResultL extends StudentL{
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
		sid++;
		//n++;
	}
}
public class SingleInheritanceEx4 {
	public static void main(String[] args) {
		System.out.println("Single Inheritance:");
		ResultL rrr = new ResultL();
		int i=1;
		
		while(i>=rrr.n) {
			rrr.sread1();
			rrr.sshow1();
		i++;
		}
	}
}