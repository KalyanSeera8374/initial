package Demo;

public class Apattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		for (int i = 0; i <=6; i++) {
			for (int j = 0; j <=6; j++) {
			  if (i>=4 && j==0 | j==6 || i==n && j==3 || i==1 && j==2 | j==4 || i==2 && j==1 | j==5 || i==3 && j>=0) {
				System.out.print("A");
			} else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
	}
}
