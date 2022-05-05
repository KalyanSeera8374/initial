package Demo;

public class Jpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <=6; i++) {
			for (int j = 0; j <=6; j++) {
				if (i==0 || j==3 || i==6 && j==2 || i==6 && j==1 ||  i==5 && j==0 || i==4 && j==0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
