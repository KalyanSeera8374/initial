package Demo;
import java.util.Scanner;
public class studprog {
	public static void main(String[] args) {
		int sno,sub1,sub2,sub3,total;
		String sname;
		float avg;
		System.out.println("Enter the Student Number");
		Scanner sc = new Scanner(System.in);
		sno = sc.nextInt();
		System.out.println("Enter the Student Name");
		sname = sc.next();
		System.out.println("Enter Subject-1");
		sub1 = sc.nextInt();
		System.out.println("Enter Subject-2");
		sub2 = sc.nextInt();
		System.out.println("Enter Subject-3");
		sub3 = sc.nextInt();
		total = sub1+sub2+sub3;
		avg = total/3;
		System.out.println("Student Number:"+sno);
		System.out.println("Student Name:"+sname);
		System.out.println("Total Marks:"+total);
		System.out.println("Average :"+avg);
	     if(avg<=50) {
	    	 System.out.println("Fail");
	     }
	     else if (avg>=60 && avg<=70) {
	    	 System.out.println("Pass");
	     }
	     
	     else if(avg>=70){
	    	 System.out.println("First class");
	     }
	     sc.close();
	}
}