package Demo;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		// perfect number 28=1+2+4+7+14
		int num,temp,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num =sc.nextInt();
		int i=1;
		temp = num;
		while(i<num) {
			if(num%i==0) {
				sum += i;
			}
			i++;
		}
		if(sum==temp) {
			System.out.println("The Numnber "+num+" is a Perfect Number.");
		}
		else {
			System.out.println("The Number "+num+" is a not Perfect Number.");
		}
	}
}
