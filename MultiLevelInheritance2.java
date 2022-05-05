package inheritance;
import java.util.Scanner;
class Company{
	static String cname ="Marolix";
	static long phoneno = 1234567890;
	static String cloc = "Hyderabad";
	public void off() {
		System.out.println("Company Name: "+cname);
		System.out.println("Company Phoneno: "+phoneno);
		System.out.println("Company Location: "+cloc);
	}
}
class EmpDetails extends Company{
	int id;
	String empname;
	long empphoneno;
	String mail;
	String empbg;
	String dob;
	String empexp;
	public void details(int id,String empname,long empphoneno,String mail,String empbg,String dob,String empexp) {
		this.id =id;
		this.empname =empname;
		this.empphoneno =empphoneno;
		this.mail =mail;
		this.empbg =empbg;
		this.dob =dob;
		this.empexp =empexp;
		
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+empname);
		System.out.println("Employee Phone no: "+empphoneno);
		System.out.println("Employee Mail: "+mail);
		System.out.println("Employee Blood Group: +empbg");
		System.out.println("Employee DOB: "+dob);
		System.out.println("Employee Experience: "+empexp);		
	}
}
public class MultiLevelInheritance2 {
	public static void main(String[] args) {
		int id;
		String name;
		long phoneno;
		String mail;
		String bg;
		String dob;
		String exp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Multi Level Inheritance:");
		System.out.println("Enter the Employee ID:");
		id=scan.nextInt();
		System.out.println("Enter the Employee Name:");
		name=scan.next();
		System.out.println("Enter the Phoneno:");
		phoneno=scan.nextLong();
		System.out.println("Enter the Mail:");
		mail=scan.next();
		System.out.println("Enter the Blood Group:");
		bg=scan.next();
		System.out.println("Enter the DateofBirth:");
		dob =scan.next();
		System.out.println("Enter the Experience:");
		exp=scan.next();
		EmpDetails emp = new EmpDetails();
		emp.off();
		emp.details(id, name, phoneno, mail, bg, dob, exp);
		
	}
}