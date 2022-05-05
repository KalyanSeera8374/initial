package Demo;

public class Bpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <=6; i++) {
			for (int j = 0; j<=6; j++) {
				if(i==0 && j<=4 || i==6 && j<=4 || j==0 || i==5 && j>=6 | j<=0 || i==4 && j==6 || i==3  && j==6 || i==2 && j==6 || i==1 && j==6 ||i==3 )
				{//i>=1 && i<=5 ||j==6
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
