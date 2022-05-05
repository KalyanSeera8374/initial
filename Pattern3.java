package Demo;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int row=5;
				int alphabet =65;
				for (int i = 0; i <=row; i++) {
					for (int j = 0; j <=row-i; j++) {
						System.out.print((char)(alphabet+j));
					}
					for (int k = 1; k <=i*2-1; k++) {
						System.out.print(" ");
					}
					for (int a = row-i; a>=0; a--) {
						if(a!=row) 
						System.out.print((char)(alphabet+a));			
					}	
					System.out.println();
				}
	     }
	}
