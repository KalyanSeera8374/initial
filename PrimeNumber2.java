package Pattern;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int i,j,c;
		System.out.println("Prime numbers from 1 to 100 are:");
		for (i = 0; i <=100; i++) {
			c = 0;
			for (j = i; j>=1; j--) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.print(i+",");
			}
		}
	}
}
