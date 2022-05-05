package Demo;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" hi");
		System.out.println("Welcome to the Hotel\n Menu \n 1.Veg Biriyani:120/rs\n 2.Veg Curry:80/rs \n 3.Meals:100rs \n 4.Chicken Biriyani:180/rs \n 5.Spicy Chicken Biriyani:200/rs \n 6.Hyd Dum Biriyani:180/rs \n 7.Prawn Biriyani:220/rs \n 8.Chicken Curry:150/rs \n 9.Butter Chicken:220/rs \n 10.Butter Naan:50/rs ");
		int i,amt=0,total=0,n;
		System.out.println("Enter the no of Item you want select\n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int j=1;j<=n;j++) {
		System.out.println("Please Select the items");
		i = sc.nextInt();
			
		if (i==1) {
			amt = amt+120;
			System.out.println("Veg Biriyani Selected");
		}
		else if (i==2) {
			amt = amt+80;
			System.out.println("Veg Curry Selected");
		}
		else if (i==3) {
			amt = amt+100;
			System.out.println("Meals");
		}
		else if (i==4) {
			amt = amt+180;
			System.out.println("Chicken Biriyani Selected");
		}
		else if (i==5) {
			amt = amt+200;
			System.out.println("Spicy Chicken Biriyani Selected");
		}
		else if (i==6) {
			amt = amt+180;
			System.out.println("Hyd Dum Biriyani Selected");
		}
		else if (i==7) {
			amt= amt+220;
			System.out.println("Prawn Biriyani Selected");
		}
		else if (i==8) {
			amt = amt+150;
			System.out.println("Chicken Curry Selected");
		}
		else if (i==9) {
			amt = amt+220;
			System.out.println("Butter Chicken Selected");
		}
		else if (i==10) {
			amt = amt+50;
			System.out.println("Butter Naan Selected");
		}
		else {
			System.out.println("Noting Is Selected");
		}
		}
		sc.close();
		total = amt;
		System.out.println("Total Amount is:"+total);
	}

}
