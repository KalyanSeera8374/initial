package Demo;

public class Apattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <=6; i++) {
			for (int j = 0; j <=6; j++) {
				if (i>=3 && j==0 || i==3 || j==6 && i>=3 || i==0 && j==3 || (i==1 && (j==2 || j==4)) || i==2 && (j==1 || j==5)  ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}		
			}
			System.out.println();
		}
	}
}
