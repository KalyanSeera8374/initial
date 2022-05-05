package Demo;

public class AApattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <=12; i++) {
			for (int j = 0; j <=12; j++) {
				if (i==0 && j==6 || i==1 && j==4 | j==8 || i==2 && j==2 | j==10 || i==3 &&  j==0 | j==12 || i==2 && j>=4 | j<=10) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
				for (int j2 = 0; j2 <=12; j2++) {
					if (i==0 && j2==6 || i==1 && j2==4 | j2==8 || i==2 && j2==2 | j2==10 || i==3 &&  j2==0 | j2==12 || i==2 && j2>=4 | j2<=10) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			System.out.println();
		}
	}
}
