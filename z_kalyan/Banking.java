package z_kalyan;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Timer;
	public class Banking{
		public static void main(String[] args) {
			int one=1;
			int two=2;
			int three=3;
			int four=4;
			int z = 3;
			int otp,verifiyOtp;		
			long usrAcNum;
			long acNum = 123456; 
			int options  ,depAmt, widAmt;
			float balance = 500000.00f;
			float totalBal;
			String acName="Boga Venu Madhav";
	        System.out.println("Well Come to Marolix Bank");
	        System.out.println("1.Deposit\n2.Withdraw\n3.Balance Check\n4.Exit");
	        Scanner sc = new Scanner(System.in);
	int i=1;
	while(i<=z) {
	    System.out.println("Choose your Operation");
	    options = sc.nextInt();
	    if(options >= 5) {
	    	System.out.println("Invailid Option");
	    	break;
	    }
	    z=options;
	    z++;

	        if (options == one ) {
	        	System.out.println("Enter your Account Number");
	        	usrAcNum = sc.nextLong();
	        	if (usrAcNum == acNum) {
	        		System.out.println("Enter your Deposite Amount");
	        		depAmt = sc.nextInt();
	        		totalBal = balance + depAmt;
	        		System.out.println("Deposite Succussfull");
	        		System.out.println("Account Holder Name: "+acName);
	        		System.out.println("Total Balance Rs: "+totalBal);
	        		System.out.println("1.Deposit\n2.Withdraw\n3.Balance Check\n4.Exit");
				}
	        	if (usrAcNum != acNum) {
	        		System.out.println("Inncorrect Account Number");
	        		break;
				}
			}
	        if (options == two) {
	        	System.out.println("Enter your Account Number");
	        	usrAcNum = sc.nextLong();
	        	if (usrAcNum == acNum) {
	        		System.out.println("Enter Withdraw Amount");
	        		widAmt = sc.nextInt();
	        		balance -= widAmt;
	        		System.out.println("Collect your cash Rs: "+widAmt);
	        		System.out.println("Account Holder Name: "+acName);
	        		System.out.println("Total Balance Rs: "+balance);
	        		System.out.println("1.Deposit\n2.Withdraw\n3.Balance Check\n4.Exit");
	        	}
	        	else if (usrAcNum != acNum) {
	        		System.out.println("Inncorrect Account Number");
	        		break;
	        	}     	
			}
	        if (options == three) {
	        	System.out.println("Enter your Account Number");
	        	usrAcNum = sc.nextLong();
	        	if(usrAcNum == acNum) {
	        		Random r = new Random();
		        	otp=r.nextInt(10000);
		        	System.out.println("OTP is: "+(otp<0 ? otp*-1 : otp));
		        	System.out.println("Enter OTP");
		        	verifiyOtp = sc.nextInt();
		       // 	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ss");
		        
		        	System.out.println("Please wait verifing....");
		        	Thread t = new Thread();
		        	int a=10, n=1;
		        	
		        	try {
		        		while(a>=n) {
		        		t.sleep(1000);
		        		System.out.println(a+" Seconds");
		             	a--;
		        		}
		        	}catch (Exception e) {
						
					}       	
		        	if (verifiyOtp == otp) {
		        		System.out.println("OTP Verified");
		        		System.out.println("Account Holder Name: "+acName);
		        		System.out.println("Total Balance Rs: "+balance);
		        		System.out.println("1.Deposit\n2.Withdraw\n3.Balance Check\n4.Exit");
		        	}
		        
		        	else if (verifiyOtp != otp) {
		        		System.out.println("Inncorrect OTP");
		        		break;
		        		}
	        	}else if (usrAcNum != acNum) {
	        		System.out.println("Inncorrect Account Number");
	        		break;
		              }	
    		}
	        else if (options == four) {
	        	System.out.println("Thank you");
	        	break;
		      }
		}
	}
}