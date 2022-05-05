package exceptionHandling;
class ATM extends Exception{
	int money=1000;
	int amount = 5000;
	public void withdraw() {
		try {
			if (amount<=money) {
				System.out.println("Collect the Cash.");
			}
			else {
				throw new UserDefinedException("Insufficent Balance");
			}
		} catch (UserDefinedException e) {
System.out.println(e);
		}
	}
}
public class UserDefinedExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("Main method:");
		ATM atm = new ATM();
		atm.withdraw();
	}
}