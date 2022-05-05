package Demo;

public class Spattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <=6; i++) {
			for (int j = 0; j <=6; j++) {
				if (i==0 && j>=1 & j<=5 || i==6 && j>=0 & j<=5 || j==0 && i<=2 || i==3 && j>=1 & j<=5 || j==6 && i>=4 & i<=5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		} 
	}
}
