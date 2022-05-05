package Demo;

public class Triangle {

	public static void main(String[] args) {
		int n=5;
		int x=n;
		for (int i = 1; i <=n; i++) {
			for (int j = 0; j <2*n; j++) {
				if ((j>=x)!=false && j<=n+i-1) {
					System.out.print("*");
				} 
				else {
					System.out.print(i);
				}
			}
			x--;
			System.out.println();
		}

	}

}
