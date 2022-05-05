package Demo;

public class Rpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <=6; i++) {
			for (int j = 0; j <=6; j++) {
				if (i==0 || j==0 ||i==3 || i==1 && j==6 || i==2 && j==6 || i==4 && j==2 || i==5 && j==4 || i==6 && j==6 ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
