package Demo;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,m=1;
		for (int i = 0; i <=1; i++) {
			for (int j = 6; j >=i; j--) {
				if(j<=n && j>=m) {
				System.out.print(" ");
					
			}
				
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
