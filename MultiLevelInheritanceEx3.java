package inheritance;
import java.util.Scanner;
class StudentM{
	int sid;
	String sname;
	public void readM() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Student id and Student Name:");
		sid = scan.nextInt();
		sname = scan.next();
	}
	public void showM() {
		System.out.println("Student ID no: "+sid);
		System.out.println("Student Name: "+sname);
	}
}
class ResultM extends StudentM{
	int sub1,sub2,sub3,total,avg;
	Scanner sc = new Scanner(System.in);
	public void readM1() {
		System.out.println("Enter the sub1,sub2 and sub3 Marks:");
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3 =sc.nextInt();
	}
	public void showM1() {
		total= sub1+sub2+sub3;
		avg=total/3;
		System.out.println("Total Marks are "+total);
	}
}
class RankM extends ResultM{
	public void readM2() {
		super.readM();
		super.readM1();
	}
	public void showM2() {
		super.showM();
		super.showM1();
		if (avg<=50) {
			System.out.println("Average of marks is "+avg+" and the Rank is FAIL.");
		} 
		else if (avg>=50 && avg<=60) {
			System.out.println("Average of marks is "+avg+" and the Rank is PASS.");
		}
		else if(avg>=60 && avg<=70) {
			System.out.println("Average of marks is "+avg+" and the Rank is FIRST CLASS.");
		}
		else if(avg>70) {
			System.out.println("Average of marks is "+avg+" and the Rank is UNIVERSITY TOPPER.");
		}
	}
}
public class MultiLevelInheritanceEx3 {
	public static void main(String[] args) {
		System.out.println("Multi Level Inheritance:");
		RankM r = new RankM();
		r.readM2();
		r.showM2();
	}
}