package Pattern;

public class Modifier {
	
	
	public int x = 10;
	public void showX()
	{
		System.out.println("X "+x);
		
	}
	
protected void multi() {
		
		
		int e = x;
		System.out.println("protected E "+e);
	}

}

	class Protected extends Modifier{
		
		
	
}
