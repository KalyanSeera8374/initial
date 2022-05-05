package Demo;

public class FibonacciSeries {

	public static void main(String[] args) {
		int i,a =0,b=1,c,n=10;
		i=1;
		while(i<=n) {
			c = a+b;
			System.out.println(a);
			a = b;
			b = c;
		i++;	
		}	
	}
}
