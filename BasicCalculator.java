package Demo;
import java.util.Scanner;
public class BasicCalculator {

	public static void main(String[] args) {
		int i,n=1,a,b;
		char ch ;
		i=1;
		while(i<=n) {
			Scanner sc = new Scanner(System.in);
			Scanner num1 = new Scanner(System.in);
			Scanner num2 = new Scanner(System.in);
			System.out.println("Select the operation:");
			System.out.println("'+'.Addiction.\n'-'.Substraction.\n'*'.Multiplication.\n'/'.Division.\n'e'.Exit.");
			ch = sc.next().charAt(0);
			System.out.println("Enter 'a' value:");
			a = num1.nextInt();
			System.out.println("Enter 'b' valve:");
			b = num2.nextInt();
				switch (ch) {
				case '+':
					System.out.println("Addiction of "+a+" and "+b+" is "+(a+b));
					break;
				case '-':
					System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
					break;
				case '*':
					System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
					break;
				case '/':
					System.out.println("Division of "+a+" and "+b+" is "+(a/b));
					break;
				case 'e':
					System.out.println("Exited");
					n=0;
					break;
				default:
					System.out.println("invalid Operation");
					break;
				}
				i++;
				n++;
			}
		}
	}

