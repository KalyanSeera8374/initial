package polymorphism;

import java.util.Scanner;

class Data_double{
	public double add(int a,int b) {
		int s=a+b;
		return s;
	}
	public double add(double a,int b ) {
		double s=a+b;
		return s;
	}
	public double add(int a,double b) {
		double s= a+b;
		return s;
	}
	public double add(double a,double b) {
		double s= a+b;
		return s;
	}
}
public class MethodOverloading3 {
	public static void main(String[] args) {
		System.out.println("Method Overloading:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		double x=sc.nextDouble();
		System.out.println("Enter the Secoand Number:");
		double y= sc.nextDouble();
		Data_double dt = new Data_double();
		double sum=dt.add(x, y);
		System.out.println(sum);
	}
}