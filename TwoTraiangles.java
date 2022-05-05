package Demo;

public class TwoTraiangles {

	public static void main(String[] args) {
		for (int i = 0; i <=6; i++) {
			for (int j = 7; j>=i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <1; k++) {
				for (int m = 7; m>=1; m--) {
					System.out.print("*");
				}
				
			}
//			for (int m = 0; m <=i; m++) {
//				System.out.print("*");
//			}
			System.out.println();
		}

	}

}
