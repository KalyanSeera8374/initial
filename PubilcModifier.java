package Demo;

import Pattern.Modifier;

class Operations{
	
	public int a = 10;
	private int c = 20;
	protected int d = -5;
	public void add() {
		int b = a+c+d;
		System.out.println("B ="+b);
		sub();
		
	}
	
	private  void sub() {
		int b = a-c+d;
		System.out.println("From sub B ="+b);
		
	}
	
	protected void multi() {
		
		
		int e = a+c+d;
		System.out.println("protected E "+e);
	}
	
	
}

public class PubilcModifier {
	
	

	public static void main(String[] args) {
			
				
				Operations op =  new Operations();
				
				op.add();
				op.a = 20;
				op.add();
				op.multi();
			
		
	}

}
