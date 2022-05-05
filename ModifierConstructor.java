package constructor;
class Modifier_Cont{
	public Modifier_Cont(){
		System.out.println("This is Public Modifier in the constructor method.");
	}
	/*private Modifier_Cont(){
		System.out.println("This is Private Modifier in the constructor method.");
		//here the private Modifier will not be Accepted by the class.
	}*/
	/*protected Modifier_Cont(){
		System.out.println("This is Public Modifier in the constructor method.");
		//here the private Modifier will be Accepted by the class.
	}*/
}
public class ModifierConstructor {
	public static void main(String[] args) {
		System.out.println("This is Main Method:");
		new Modifier_Cont();
	}
}